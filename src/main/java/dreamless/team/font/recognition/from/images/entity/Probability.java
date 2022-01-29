
package dreamless.team.font.recognition.from.images.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "font",
    "probability"
})
@Generated("jsonschema2pojo")
public class Probability {

    @JsonProperty("font")
    private String font;
    @JsonProperty("probability")
    private Double probability;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Probability() {
    }

    /**
     * 
     * @param probability
     * @param font
     */
    public Probability(String font, Double probability) {
        super();
        this.font = font;
        this.probability = probability;
    }

    @JsonProperty("font")
    public String getFont() {
        return font;
    }

    @JsonProperty("font")
    public void setFont(String font) {
        this.font = font;
    }

    public Probability withFont(String font) {
        this.font = font;
        return this;
    }

    @JsonProperty("probability")
    public Double getProbability() {
        return probability;
    }

    @JsonProperty("probability")
    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public Probability withProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Probability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("font");
        sb.append('=');
        sb.append(((this.font == null)?"<null>":this.font));
        sb.append(',');
        sb.append("probability");
        sb.append('=');
        sb.append(((this.probability == null)?"<null>":this.probability));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
