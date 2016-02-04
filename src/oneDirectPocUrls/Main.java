package oneDirectPocUrls;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author akosha
 *
 *         POC to call URLs
 */

public class Main {

	private static Scanner in = new Scanner(System.in);
	private final static String CUSTOM_API_URL = "http://api.diffbot.com/v3/consumerComplaint";
	private static String queryString = "?token=e2728ec0e0da146d6bea6a07fd971662&url=";
	private static String url = null;

	public static  String getStringFromResponse(HttpResponse response) {
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

	public static  String executeRequest() {
		System.out.print("Enter Url to scrape : ");
		queryString += in.nextLine();
		url = CUSTOM_API_URL + queryString;
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

	 static void populateClasses(String jsonResponse) {
		Gson gson = new GsonBuilder().create();
		try {
			ResponseClass responseClass = gson.fromJson(jsonResponse, ResponseClass.class);
			responseClass.getObjects();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException, ClientProtocolException {
		String jsonResponse = executeRequest();
		populateClasses(jsonResponse);
	}
}
