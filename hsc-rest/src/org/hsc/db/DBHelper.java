package org.hsc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hsc.model.ENumber;
import org.hsc.model.Form;

public class DBHelper {
	private static DBHelper dbHelper;
	private Connection con;
	private static String DRIVER_POSTGRES = "org.postgresql.Driver";
	private static String URL = "jdbc:postgresql://203.146.127.162:5432/adempiere-dev";
	private static String USER = "adempiere";
	private static String PASS = "adempiere";
	
	public static String TABLE_NAME_ENUMBER = "HSC_Halal_Enumber";
	
	public static DBHelper getDBHelper(){
		if(dbHelper == null){
			dbHelper =  new DBHelper();
		}
		return dbHelper;
	}
	private DBHelper(){
		try {
			Class.forName(DRIVER_POSTGRES);
			connect();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void connect(){
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void close(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void truncate(String tableName){
		String sql = "Truncate table " + tableName;
		
		try {
			if(con.isClosed()){
				connect();
			}
			Statement stmt = con.createStatement();
			int rows = stmt.executeUpdate(sql);
			System.out.println(rows + " rows deleted from " + tableName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<ENumber> getENumberList(){
		List<ENumber> eNumberList = new ArrayList<ENumber>();
		String sql = "select * from " + TABLE_NAME_ENUMBER;
		
		try {
			
			if(con.isClosed())
				connect();
			
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			while(res.next()){
				
				ENumber enumber = new ENumber(res.getString("code"),res.getString("name"),res.getString("description"),res.getInt("halal_status"),null);
				eNumberList.add(enumber);
			}
			
			
			close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return eNumberList;
	}
	
	public int insertENumber(List<ENumber> eNumberList){
		int id = 0;
		
		String sqlInsertENumber = "insert into hsc_halal_enumber (hsc_halal_enumber_id, ad_client_id,ad_org_id,createdby,updatedby,code,name,description,halal_status) " +
									" values(  ? ,1000000 ,1000000 ,1000000 ,1000000 ,?,?,?,?) ";
		String sqlSelectNextId = "select currentnext from ad_sequence where name='HSC_Halal_Enumber'";
		
		String sqlUpdateNextId = "update ad_sequence set currentnext = currentnext + 1  where name = 'HSC_Halal_Enumber'";
		
		try {
			
			if(con.isClosed())
				connect();
			PreparedStatement pStmt = con.prepareStatement(sqlInsertENumber);
			
			Iterator<ENumber> iterator = eNumberList.iterator();
			while(iterator.hasNext()){
			//get next hsc_halal_form_id
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(sqlSelectNextId);
			res.next();
			int nextId = res.getInt("currentnext");
			System.out.println("next id : " + nextId);
			
			// insert new form
			ENumber enumber = iterator.next();
			pStmt.setInt(1, nextId);
			pStmt.setString(2, enumber.getEnumber());
			pStmt.setString(3, enumber.getName());
			pStmt.setString(4, enumber.getDescription());
			pStmt.setInt(5, enumber.getHalalStatus());
			int row = pStmt.executeUpdate();
			id = nextId;
			System.out.println("inserted new ENumber, id " + id);
			
			//update next id
			row = stmt.executeUpdate(sqlUpdateNextId);
			System.out.println("update next id, row affected " + row);
			}
			
			
			close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id;
	}
	
	
	public int insertENumber(ENumber enumber){
		int id = 0;
		
		String sqlInsertENumber = "insert into hsc_halal_enumber (hsc_halal_enumber_id, ad_client_id,ad_org_id,createdby,updatedby,code,name,description,halal_status) " +
									" values(  ? ,1000000 ,1000000 ,1000000 ,1000000 ,?,?,?,?) ";
		String sqlSelectNextId = "select currentnext from ad_sequence where name='HSC_Halal_Enumber'";
		
		String sqlUpdateNextId = "update ad_sequence set currentnext = currentnext + 1  where name = 'HSC_Halal_Enumber'";
		
		try {
			
			if(con.isClosed())
				connect();
			
			//get next hsc_halal_form_id
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(sqlSelectNextId);
			res.next();
			int nextId = res.getInt("currentnext");
			System.out.println("next id : " + nextId);
			
			// insert new form
			PreparedStatement pStmt = con.prepareStatement(sqlInsertENumber);
			pStmt.setInt(1, nextId);
			pStmt.setString(2, enumber.getEnumber());
			pStmt.setString(3, enumber.getName());
			pStmt.setString(4, enumber.getDescription());
			pStmt.setInt(5, enumber.getHalalStatus());
			int row = pStmt.executeUpdate();
			id = nextId;
			System.out.println("inserted new ENumber, id " + id);
			
			//update next id
			row = stmt.executeUpdate(sqlUpdateNextId);
			System.out.println("update next id, row affected " + row);
			
			close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id;
	}
	
	public Form getForm(int id){
		String sql = "select * from hsc_halal_form where hsc_halal_form_id = " + id;
		Form form = null;
			
			try {
				if(con.isClosed())
					connect();
				
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery(sql);
				if(res.next()){
					form = new Form(res.getString("name"));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return form;
		
	}
	
	public int insertHalalForm(Form form){
		int ref = 0;
		
//		String sqlInsertForm = "Insert into HSC_HALAL_FORM (hsc_halal_form_id,ad_client_id,ad_org_id,createdby,updatedby,name) " +
//				"values(?,1000000,1000000,1000000,1000000,?)";
		String sqlInsertForm = generateInsertFormSql(form);
		
		String sqlSelectNextId = "select currentnext from ad_sequence where name='HSC_Halal_Form'";
		
		String sqlUpdateNextId = "update ad_sequence set currentnext = currentnext + 1  where name like 'HSC_Halal_Form'";
		
		try {
			
			if(con.isClosed())
				connect();
			
			//get next hsc_halal_form_id
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(sqlSelectNextId);
			res.next();
			int nextId = res.getInt("currentnext");
			System.out.println("next id : " + nextId);
			
			// insert new form
			PreparedStatement pStmt = con.prepareStatement(sqlInsertForm);
			pStmt.setInt(1, nextId);
//			pStmt.setString(2, form.getName());
			int row = pStmt.executeUpdate();
			ref = nextId;
			System.out.println("insert new form, row affected " + row);
			
			//update next id
			row = stmt.executeUpdate(sqlUpdateNextId);
			System.out.println("update next id, row affected " + row);
			
			close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ref;
	}
	
	public int saveForm(Form form) {
		// TODO Auto-generated method stub
		int ref = (int)form.getRef();
		if((form.getRef() == 0) ){ // new form
			ref = insertHalalForm(form);
		}else{
			ref = updateHalalForm(form);
		}
		return ref;
	}
	public String generateInsertFormSql(Form form){
		Map<String,String> formValues = form.getValues();
//		Iterator<String> iterator = formValues.keySet().iterator();
		
		StringBuilder sqlBuilder = new StringBuilder();
		sqlBuilder.append("Insert into HSC_Halal_Form ");
		sqlBuilder.append("values(?, 1000000, 1000000, 'Y', now(), 1000000 , now() , 1000000 ");
		sqlBuilder.append(",'" + form.getName()+"'");
		for(int i = 0; i <= 86; i++){
			String key = "field" + i;
			String value = formValues.get(key);
			value = CicotUtils.replaceNullWithEmptyString(value);
			
			sqlBuilder.append(",'" + value + "' ");
		}
		sqlBuilder.append(")");
		return sqlBuilder.toString();
	}
	public String generateUpdateFormSql(Form form){
		Map<String,String> formValues = form.getValues();
		Iterator<String> iterator = formValues.keySet().iterator();
		
		StringBuilder sqlBuilder = new StringBuilder();
		sqlBuilder.append("Update HSC_Halal_Form ");
		sqlBuilder.append("set name = '" + form.getName() + "' ");
		while(iterator.hasNext()){
			String key = iterator.next();
			String value = formValues.get(key);
			value = CicotUtils.replaceNullWithEmptyString(value);
			
			sqlBuilder.append("," + key + " = '" + value+ "' ");
		}
		sqlBuilder.append("Where HSC_Halal_Form_id = " + form.getRef() + " ");
		return sqlBuilder.toString();
	}
	public int updateHalalForm(Form form) {
		// TODO Auto-generated method stub
		int hscHalalFormId = (int)form.getRef();
		String updateSql = generateUpdateFormSql(form);
		try {
			if(con.isClosed()) connect();
			Statement stmt = con.createStatement();
			int rowEffected = stmt.executeUpdate(updateSql);
			System.out.println("Update " + rowEffected + " row(s)");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return hscHalalFormId;
	}
}
