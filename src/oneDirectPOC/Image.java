
package oneDirectPOC;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Image {

    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("naturalHeight")
    @Expose
    private Integer naturalHeight;
    @SerializedName("diffbotUri")
    @Expose
    private String diffbotUri;
    @SerializedName("pageUrl")
    @Expose
    private String pageUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("naturalWidth")
    @Expose
    private Integer naturalWidth;
    @SerializedName("height")
    @Expose
    private Integer height;

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The naturalHeight
     */
    public Integer getNaturalHeight() {
        return naturalHeight;
    }

    /**
     * 
     * @param naturalHeight
     *     The naturalHeight
     */
    public void setNaturalHeight(Integer naturalHeight) {
        this.naturalHeight = naturalHeight;
    }

    /**
     * 
     * @return
     *     The diffbotUri
     */
    public String getDiffbotUri() {
        return diffbotUri;
    }

    /**
     * 
     * @param diffbotUri
     *     The diffbotUri
     */
    public void setDiffbotUri(String diffbotUri) {
        this.diffbotUri = diffbotUri;
    }

    /**
     * 
     * @return
     *     The pageUrl
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**
     * 
     * @param pageUrl
     *     The pageUrl
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The naturalWidth
     */
    public Integer getNaturalWidth() {
        return naturalWidth;
    }

    /**
     * 
     * @param naturalWidth
     *     The naturalWidth
     */
    public void setNaturalWidth(Integer naturalWidth) {
        this.naturalWidth = naturalWidth;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

}
