package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		System.out.println("Catalogue ");
		printOnlyBooks();
		printOnlyCDs();
	}
	
	public void printOnlyBooks() {
		System.out.println("Livres : ");
		PrintBook printBook = new PrintBook();
		for (Item item : items) {
			item.accept(printBook);
		}
	}

	public void printOnlyCDs() {
		System.out.println("CDs : ");
		PrintCD printCD = new PrintCD();
		for (Item item : items) {
			item.accept(printCD);
		}
	}

}
