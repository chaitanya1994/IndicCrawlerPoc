package oneDirectPOC;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author akosha
 *
 *         POC to get DATA from g
 */

public class ComplaintData {

	private final static String ARTICLE_URL = "http://api.diffbot.com/v3/article";
	private static String queryString = "?token=e2728ec0e0da146d6bea6a07fd971662&url=";

	public  String getStringFromResponse(HttpResponse response) {
		String jsonResponse = null;
		if (response == null) {
			return null;
		}
		HttpEntity entity = response.getEntity();
		if (entity != null) {
			try {	
				jsonResponse = EntityUtils.toString(entity);
			} catch (Exception e) {
				System.err.println("Error while getting the data from response");
				e.printStackTrace();
			}
		}
		return jsonResponse;
	}

	public String executeRequest(String targetURL) {
		/*
		 * System.out.print("Enter Url to scrape : "); 
		 * in.nextLine();
		 */
		String arguments = queryString + targetURL;
		String url = ARTICLE_URL + arguments;
		HttpResponse response = null;
		HttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		try {
			response = client.execute(get);
		} catch (Exception e) {
			System.err.println("HTTP Client Call Failed");
		}
		return getStringFromResponse(response);
	}

	 void populateClasses(String jsonResponse) {
		Gson gson = new GsonBuilder().create();
		try {
			DataResponseClass dataResponseClass = gson.fromJson(jsonResponse, DataResponseClass.class);
			System.out.println(dataResponseClass.getObjects().isEmpty());
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public void setComplaintData(String url) {
		String jsonResponse = executeRequest(url);
		populateClasses(jsonResponse);
	}
}
