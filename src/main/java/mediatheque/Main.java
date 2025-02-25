package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        System.out.println("******* Médiathèque :");
        mediatheque.printCatalog();
        //mediatheque.printOnlyBooks();
        System.out.println("******* les livres seulement");
        mediatheque.printOnlyBooks();

        //mediatheque.printOnlyCDs();
        System.out.println("(******* les CD seulement");
        mediatheque.printOnlyCDs();
    }
}
