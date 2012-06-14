package org.hsc.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Form implements Serializable{
	private long id;
	private String name;
	private long ref;	// hsc_halq_form_id
	
	public long getRef() {
		return ref;
	}
	public void setRef(long ref) {
		this.ref = ref;
	}

	private Map<String, String> values;
	private Set<String> keySet;
	
	public Form(){
		this(-1,null,0);
	}
	public Form(long id, String name, long ref) {
		super();
		this.id = id;
		this.name = name;
		this.ref = ref;
		values = new HashMap<String, String>();
		
		for(int i = 0; i <= 86; i++){
			StringBuilder fieldName = new StringBuilder("field");
			fieldName.append(i);
			values.put(fieldName.toString(), null);
		}
	}
	public Form(String name) {
		// TODO Auto-generated constructor stub
		this(-1,name,0);
	}
	public long getId() {
		return id;
	}
	public void setValue(String key,String value){
		values.put(key, value);
	}
	public String getValue(String key){
		return values.get(key);
	}
	public void setId(long id) {
		this.id = id;
	}
	public Map<String, String> getValues() {
		return values;
	}
	public void setValues(Map<String, String> values) {
		this.values = values;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
//		return "Form [name=" + name + ", field0=" + field0 + "]";
		return name;
	}

	
	
}
