public class Main {
    public static void main(String[] args) {
        Book book = new Book("War and Peace");
        BookMove fromAvailable = new AvaibleToArchived();
        BookMove fromBorrowed = new BorroedTo();
        BookMove fromOverdued = new OverruedTo();
        BookMove fromArchived = new ArchivedToAvaible();

        fromAvailable.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());


        fromBorrowed.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());

        fromOverdued.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());


        fromAvailable.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatus());

        fromArchived.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
    }
}
