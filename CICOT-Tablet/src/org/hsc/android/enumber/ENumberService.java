package org.hsc.android.enumber;

import java.util.ArrayList;
import java.util.List;

import org.hsc.android.JSONParser;
import org.hsc.android.db.ENumberDAO;
import org.hsc.model.ENumber;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ENumberService {
	//Web service url
	private String url = "http://203.146.127.162:6080/hsc-rest/rest/enumber";
	private ENumberDAO eNumberDAO;
	
	public ENumberDAO geteNumberDAO() {
		return eNumberDAO;
	}



	public void seteNumberDAO(ENumberDAO eNumberDAO) {
		this.eNumberDAO = eNumberDAO;
	}



		//	private static String url = "http://10.0.2.2:8080/hsc-rest/rest/enumber";
	// JSON Node names
		private static final String TAG_ENUMBER = "eNumber";
		private static final String TAG_CODE = "enumber";
		private static final String TAG_NAME = "name";
		private static final String TAG_DESCRIPTION = "description";
		private static final String TAG_STATUS = "halalStatus";
		
	
		

		public ENumberService() {
			super();
		}



		public ENumberService(String url) {
			super();
			this.url = url;
		}



		public List<ENumber> loadENumber() {
			
			List<ENumber> eNumberList = new ArrayList<ENumber>();
			// JSON Node names
			JSONArray enumbers = null;
			// Creating JSON Parser instance
			JSONParser jParser = new JSONParser();

			// getting JSON string from URL
			JSONObject json = jParser.getJSONFromUrl(url);

			try {
				enumbers = json.getJSONArray(TAG_ENUMBER);
				
				// looping through All Contacts
				for (int i = 0; i < enumbers.length(); i++) {
					JSONObject c = enumbers.getJSONObject(i);

					// Storing each json item in variable
					String code = c.getString(TAG_CODE);
					String name = c.getString(TAG_NAME);
					String description = c.getString(TAG_DESCRIPTION);
					String status = c.getString(TAG_STATUS);

					// creating new ENumber obj
					ENumber eNumberObj = new ENumber(code, name, description, Integer.parseInt(status), null);

					// adding  to ArrayList
					eNumberList.add(eNumberObj);
				}	
				
//					/**
//					 * Updating parsed JSON data db
//					 * */
//					
//					ENumberDAO eNumberDAO = myapp.getENumberDAO();
//					eNumberDAO.updateENumber(eNumberList);
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return eNumberList;
		}


		/**
		 * 
		 * @param eNumberSearch -- without leading 'E', eg. 100, 160a
		 * @return
		 */
		public ENumber get(String eNumberSearch) {
			// TODO Auto-generated method stub
			ENumber eNumberFound = null;
			eNumberSearch = eNumberSearch.toLowerCase();
			eNumberSearch = "E"+eNumberSearch;
			
			System.out.println("Search e-number : " + eNumberSearch);
			eNumberFound = eNumberDAO.get(eNumberSearch);
			return eNumberFound;
		}
}
