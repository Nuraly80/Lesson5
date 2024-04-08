public class ArchivedToAvaible extends BookMove{
    protected void moveToStatus(Book book, Status requestedStatus){
        switch (requestedStatus){
            case AVAILABLE -> book.setStatus(requestedStatus);
            case ARCHIVED, BORROWED, OVERDUED -> System.out.println("Перевод книги из статуса 'ARCHIVED' в статус '"+requestedStatus + "' невозможен");

        }
    }
}
