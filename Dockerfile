FROM openjdk:17-alpine as build

WORKDIR /dreamless

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

RUN chmod +x ./mvnw
# download the dependency if needed or if the pom file is changed
RUN ./mvnw dependency:go-offline -B

COPY src src

RUN ./mvnw package -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

# Production Stage for Spring boot application image
FROM openjdk:17-alpine
ARG DEPENDENCY=/dreamless/target/dependency

# Copy the dependency application file from build stage artifact
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /dreamless/lib
COPY --from=build ${DEPENDENCY}/META-INF /dreamless/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /dreamless

# Run the Spring boot application
ENTRYPOINT ["java", "-cp", "dreamless:dreamless/lib/*","dreamless.team.font.recognition.from.images.FontRecognitionFromImagesApplication"]

EXPOSE 8080