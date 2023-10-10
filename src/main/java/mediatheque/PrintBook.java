package mediatheque;

public class PrintBook implements Visitor {

    public void visit(Book book) {
        System.out.println("Titre : " + book.getTitle() + ", Auteur: " + book.getAuthor());
    }

    public void visit(CD cd) {}
}
