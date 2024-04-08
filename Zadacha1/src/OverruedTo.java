public class OverruedTo extends BookMove{
    protected void moveToStatus(Book book, Status requestedStatus){
        switch (requestedStatus){
            case ARCHIVED, AVAILABLE -> book.setStatus(requestedStatus);
            case BORROWED, OVERDUED -> System.out.println("Перевод книги из статуса 'OVERDUED' в статус '"+requestedStatus + "' невозможен");

        }
    }
}
