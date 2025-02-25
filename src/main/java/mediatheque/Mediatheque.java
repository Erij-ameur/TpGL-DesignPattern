package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		accept(new ItemPrinter());
	}
	
	public void printOnlyBooks() {
		accept(new BookPrinter());
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
	}

	public void printOnlyCDs() {
		accept(new CDPrinter());
	}

	private void accept(ItemVisitor v) {
        for (Item i : items) {
            i.accept(v);
        }
    }

}
