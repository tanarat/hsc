package org.hsc.db;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

import org.hsc.model.ENumber;
import org.hsc.model.Form;

public class TestDBHelper {
	public static void main(String[] args) throws FileNotFoundException {
//		Form form = new Form();
//		form.setName("ha ha ha hu hu hu 555");
//		form.setRef(1000021);
//		form.setValue("field0", "Banana IT xxxx");
//		form.setValue("field1", "Bangkok");
		DBHelper dbHelper = DBHelper.getDBHelper();
		Form form = dbHelper.getForm(1000022);
		System.out.println(form.getName());
//		String sql = dbHelper.generateInsertFormSql(form);
//		System.out.println(sql);
		
//		System.out.println("ref = " + dbHelper.saveForm(form));
		
		
	}
}
