
package oneDirectPOC;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Tag {

    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("rdfTypes")
    @Expose
    private List<String> rdfTypes = new ArrayList<String>();

    /**
     * 
     * @return
     *     The score
     */
    public Double getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * 
     * @param uri
     *     The uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 
     * @return
     *     The rdfTypes
     */
    public List<String> getRdfTypes() {
        return rdfTypes;
    }

    /**
     * 
     * @param rdfTypes
     *     The rdfTypes
     */
    public void setRdfTypes(List<String> rdfTypes) {
        this.rdfTypes = rdfTypes;
    }

}
