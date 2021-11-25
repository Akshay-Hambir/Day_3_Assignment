package assignments1;

public class BookDemo {
    public void createBook(Book b, String bookName, float bookPrice){
        b.setBookTitle(bookName);
        b.setPrice(bookPrice);
    }

    public void showBooks(Book[] b){
        for(Book book: b){
            System.out.println("------------------------------");
            System.out.println("Book Title : "+book.getBookTitle());
            System.out.println("Book Price : "+book.getPrice()+ " Rs.");
            System.out.println("---------------");
        }
    }
}
