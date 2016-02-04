package oneDirectPOC;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DataResponseClass {

    @SerializedName("breadcrumb")
    @Expose
    private List<Breadcrumb> breadcrumb = new ArrayList<Breadcrumb>();
    @SerializedName("request")
    @Expose
    private DataRequest request;
    @SerializedName("objects")
    @Expose
    private List<DataObject> objects = new ArrayList<DataObject>();

    /**
     * 
     * @return
     *     The breadcrumb
     */
    public List<Breadcrumb> getBreadcrumb() {
        return breadcrumb;
    }

    /**
     * 
     * @param breadcrumb
     *     The breadcrumb
     */
    public void setBreadcrumb(List<Breadcrumb> breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    /**
     * 
     * @return
     *     The request
     */
    public DataRequest getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    public void setRequest(DataRequest request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The objects
     */
    public List<DataObject> getObjects() {
        return objects;
    }

    /**
     * 
     * @param objects
     *     The objects
     */
    public void setObjects(List<DataObject> objects) {
        this.objects = objects;
    }

}
