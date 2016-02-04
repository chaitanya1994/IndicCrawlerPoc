
package oneDirectPocUrls;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import oneDirectPOC.ComplaintData;

@Generated("org.jsonschema2pojo")
public class Object {

	@SerializedName("nextPages")
	@Expose
	private List<String> nextPages = new ArrayList<String>();
	@SerializedName("numPages")
	@Expose
	private Integer numPages;
	@SerializedName("diffbotUri")
	@Expose
	private String diffbotUri;
	@SerializedName("pageUrl")
	@Expose
	private String pageUrl;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("titleUrls")
	@Expose
	private List<TitleUrl> titleUrls = new ArrayList<TitleUrl>();

	/**
	 * 
	 * @return The nextPages
	 */
	public List<String> getNextPages() {
		return nextPages;
	}

	/**
	 * 
	 * @param nextPages
	 *            The nextPages
	 */
	public void setNextPages(List<String> nextPages) {
		this.nextPages = nextPages;
	}

	/**
	 * 
	 * @return The numPages
	 */
	public Integer getNumPages() {
		return numPages;
	}

	/**
	 * 
	 * @param numPages
	 *            The numPages
	 */
	public void setNumPages(Integer numPages) {
		this.numPages = numPages;
	}

	/**
	 * 
	 * @return The diffbotUri
	 */
	public String getDiffbotUri() {
		return diffbotUri;
	}

	/**
	 * 
	 * @param diffbotUri
	 *            The diffbotUri
	 */
	public void setDiffbotUri(String diffbotUri) {
		this.diffbotUri = diffbotUri;
	}

	/**
	 * 
	 * @return The pageUrl
	 */
	public String getPageUrl() {
		return pageUrl;
	}

	/**
	 * 
	 * @param pageUrl
	 *            The pageUrl
	 */
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	/**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The titleUrls
	 */
	public List<TitleUrl> getTitleUrls() {
		for (TitleUrl titleUrl : titleUrls) {
			if (titleUrl.getUrl() != null) {
				System.out.println(titleUrl.getUrl());
				new ComplaintData().setComplaintData(titleUrl.getUrl().trim());
			}
		}
		return titleUrls;
	}

	/**
	 * 
	 * @param titleUrls
	 *            The titleUrls
	 */
	public void setTitleUrls(List<TitleUrl> titleUrls) {
		this.titleUrls = titleUrls;
	}

}
