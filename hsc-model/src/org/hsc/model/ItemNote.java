package org.hsc.model;

import java.util.HashSet;
import java.util.Set;

public class ItemNote {
	private long itemId;
	private Set<Integer> reasonsCheck;
	private boolean isConform;
	private String note;
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public boolean isConform() {
		return isConform;
	}
	public void setConform(boolean isConform) {
		this.isConform = isConform;
	}
	//	private int index;
	public ItemNote(long itemId) {
		super();
		this.setItemId(itemId);
		this.reasonsCheck = new HashSet<Integer>();
	}
	
	public void check(int index){
		reasonsCheck.add(index);
	}
	public void uncheck(int index){
		reasonsCheck.remove(index);
	}
	public Integer[] getReasonsCheck() {
		return reasonsCheck.toArray(new Integer[reasonsCheck.size()]);
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public void print(){
		System.out.printf("[%d] [%s] %s [%s]\n", itemId,isConform,reasonsCheck.toString(),note);
	}
	public static void main(String args[]){
		ItemNote itemNote = new ItemNote(1000001);
		itemNote.check(0);
		itemNote.check(2);
		itemNote.setNote("hello");
		itemNote.print();
	}
	
}
