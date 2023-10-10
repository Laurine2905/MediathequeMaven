package mediatheque;

public class PrintCatalogue implements Visitor {
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor());
    }

    public void visit(CD cd) {
        System.out.println("CD: " + cd.getTitle() + ", Number of Tracks: " + cd.getNumberOfTracks());
    }
}
