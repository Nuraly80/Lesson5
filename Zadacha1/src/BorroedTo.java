public class BorroedTo extends BookMove{
    protected void moveToStatus(Book book, Status requestedStatus){
        switch (requestedStatus){
            case ARCHIVED, OVERDUED -> book.setStatus(requestedStatus);
            case AVAILABLE, BORROWED -> System.out.println("Перевод книги из статуса 'BORROWED' в статус '"+requestedStatus + "' невозможен");

        }
    }
}
