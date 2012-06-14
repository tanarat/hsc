package org.hsc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChecklistNote {
	private List<ItemNote> itemNotes;
	
	public ChecklistNote(List<Item> items){
		itemNotes = new ArrayList<ItemNote>();
		for (Iterator iterator = items.iterator(); iterator.hasNext();) {
			Item item = (Item) iterator.next();
			itemNotes.add(new ItemNote(item.getId()));
		}
	}
	public ItemNote getItemNote(int index) {
		// TODO Auto-generated method stub
		return itemNotes.get(index);
	}
	public void print(){
		for (Iterator iterator = itemNotes.iterator(); iterator.hasNext();) {
			ItemNote itemNote = (ItemNote) iterator.next();
			itemNote.print();
		}
	}
	public static void main(String args[]){
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1000001,"4.3","aaa"));
		items.add(new Item(1000002,"4.5","bbb"));
		ChecklistNote checklistNote = new ChecklistNote(items);
		ItemNote itemNote1 = checklistNote.getItemNote(1);
		itemNote1.setNote("How are you?");
		itemNote1.check(2);
		itemNote1.check(1);
		itemNote1.print();
	}
	
}
