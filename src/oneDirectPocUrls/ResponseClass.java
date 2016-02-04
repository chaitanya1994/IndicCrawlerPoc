
package oneDirectPocUrls;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ResponseClass {

    @SerializedName("request")
    @Expose
    private Request request;
    @SerializedName("objects")
    @Expose
    private List<Object> objects = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The request
     */
    public Request getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The objects
     */
    public List<Object> getObjects() {
    	for (Object object : objects) {
			object.getTitleUrls();
		}
        return objects;
    }

    /**
     * 
     * @param objects
     *     The objects
     */
    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

}
