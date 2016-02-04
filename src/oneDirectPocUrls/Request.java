
package oneDirectPocUrls;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Request {

    @SerializedName("pageUrl")
    @Expose
    private String pageUrl;
    @SerializedName("api")
    @Expose
    private String api;
    @SerializedName("version")
    @Expose
    private Integer version;

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
     *     The api
     */
    public String getApi() {
        return api;
    }

    /**
     * 
     * @param api
     *     The api
     */
    public void setApi(String api) {
        this.api = api;
    }

    /**
     * 
     * @return
     *     The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

}
