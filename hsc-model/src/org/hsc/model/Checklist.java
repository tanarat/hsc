package org.hsc.model;

import java.util.ArrayList;
import java.util.List;

public class Checklist {
	private long id;
	private String checklistName;
	private List<Item> items; //list of item id
	
	public Checklist() {
		super();
		// TODO Auto-generated constructor stub
		items = new ArrayList<Item>();
	}

	public Checklist(long id, String checklistName) {
		super();
		this.id = id;
		this.checklistName = checklistName;
		items = new ArrayList<Item>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return checklistName;
	}

	public void setName(String checklistName) {
		this.checklistName = checklistName;
	}

	public List<Item> getItems() {
		return items;
	}
	public void addItemId(Item itemId){
		items.add(itemId);
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return checklistName;
	}


	
}
