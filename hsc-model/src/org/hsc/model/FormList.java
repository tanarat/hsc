package org.hsc.model;

import java.util.ArrayList;
import java.util.List;

public class FormList {
	private List<Form> formList;
	

	public FormList() {
		super();
		// TODO Auto-generated constructor stub
		formList = new ArrayList<Form>();
	}
	public void addForm(Form form){
		formList.add(form);
	}
	public List<Form> getFormList(){
		return formList;
	}
	public int getNumberOfForm(){
		return formList.size();
	}
	public Form getForm(int index){
		return formList.get(index);
	}
	public void setFormList(List<Form> formList){
		this.formList = formList;
	}
	
}
