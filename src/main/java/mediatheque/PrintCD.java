package mediatheque;

public class PrintCD implements Visitor {
    public void visit(Book book) {}

    public void visit(CD cd) {
        System.out.println("CD: " + cd.getTitle() + ", Number of Tracks: " + cd.getNumberOfTracks());
    }
}
