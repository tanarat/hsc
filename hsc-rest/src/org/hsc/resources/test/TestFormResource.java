package org.hsc.resources.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.hsc.model.ENumber;

import com.google.gson.Gson;

public class TestFormResource {
	public static void main(String[] args) {
		String uri = "http://localhost:8080/hsc-rest/rest/enumber";
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(uri);
//		getRequest.addHeader("accept", "text");
		try {
			HttpResponse response = httpClient.execute(getRequest);
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
				   + response.getStatusLine().getStatusCode());
			}
	 
			BufferedReader br = new BufferedReader(
	                         new InputStreamReader((response.getEntity().getContent())));
	 
			String output = br.readLine();
			
			System.out.println("Output from Server .... \n" + output);
			
			Gson gson = new Gson();
			gson.fromJson(output, ENumber.class);
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
