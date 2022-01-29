
package dreamless.team.font.recognition.from.images.entity;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "probabilities"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("probabilities")
    private List<Probability> probabilities = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param probabilities
     */
    public Data(List<Probability> probabilities) {
        super();
        this.probabilities = probabilities;
    }

    @JsonProperty("probabilities")
    public List<Probability> getProbabilities() {
        return probabilities;
    }

    @JsonProperty("probabilities")
    public void setProbabilities(List<Probability> probabilities) {
        this.probabilities = probabilities;
    }

    public Data withProbabilities(List<Probability> probabilities) {
        this.probabilities = probabilities;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("probabilities");
        sb.append('=');
        sb.append(((this.probabilities == null)?"<null>":this.probabilities));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
