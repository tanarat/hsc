package org.hsc.model;

import java.util.List;

public class Item {
	private long id;
	private String itemNo;
	private String itemName;
	private List<String> reasons;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(long id, String itemNo, String item) {
		super();
		this.id = id;
		this.itemNo = itemNo;
		this.itemName = item;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public List<String> getReasons() {
		return reasons;
	}
	public void setReasons(List<String> reasons) {
		this.reasons = reasons;
	}
	@Override
	public String toString() {
		return itemNo + " " + itemName;
	}
	
	
}
