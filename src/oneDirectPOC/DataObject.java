
package oneDirectPOC;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DataObject {

	@SerializedName("numPages")
	@Expose
	private Integer numPages;
	@SerializedName("humanLanguage")
	@Expose
	private String humanLanguage;
	@SerializedName("confidence")
	@Expose
	private Double confidence;
	@SerializedName("diffbotUri")
	@Expose
	private String diffbotUri;
	@SerializedName("pageUrl")
	@Expose
	private String pageUrl;
	@SerializedName("numPosts")
	@Expose
	private Integer numPosts;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("posts")
	@Expose
	private List<Post> posts = new ArrayList<Post>();
	@SerializedName("participants")
	@Expose
	private Integer participants;
	@SerializedName("rssUrl")
	@Expose
	private String rssUrl;
	@SerializedName("tags")
	@Expose
	private List<Tag> tags = new ArrayList<Tag>();

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
	 * @return The humanLanguage
	 */
	public String getHumanLanguage() {
		return humanLanguage;
	}

	/**
	 * 
	 * @param humanLanguage
	 *            The humanLanguage
	 */
	public void setHumanLanguage(String humanLanguage) {
		this.humanLanguage = humanLanguage;
	}

	/**
	 * 
	 * @return The confidence
	 */
	public Double getConfidence() {
		return confidence;
	}

	/**
	 * 
	 * @param confidence
	 *            The confidence
	 */
	public void setConfidence(Double confidence) {
		this.confidence = confidence;
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
	 * @return The numPosts
	 */
	public Integer getNumPosts() {
		return numPosts;
	}

	/**
	 * 
	 * @param numPosts
	 *            The numPosts
	 */
	public void setNumPosts(Integer numPosts) {
		this.numPosts = numPosts;
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
	 * @return The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return The posts
	 */
	public List<Post> getPosts() {
		return posts;
	}

	/**
	 * 
	 * @param posts
	 *            The posts
	 */
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	/**
	 * 
	 * @return The participants
	 */
	public Integer getParticipants() {
		return participants;
	}

	/**
	 * 
	 * @param participants
	 *            The participants
	 */
	public void setParticipants(Integer participants) {
		this.participants = participants;
	}

	/**
	 * 
	 * @return The rssUrl
	 */
	public String getRssUrl() {
		return rssUrl;
	}

	/**
	 * 
	 * @param rssUrl
	 *            The rssUrl
	 */
	public void setRssUrl(String rssUrl) {
		this.rssUrl = rssUrl;
	}

	/**
	 * 
	 * @return The tags
	 */
	public List<Tag> getTags() {
		return tags;
	}

	/**
	 * 
	 * @param tags
	 *            The tags
	 */
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}
