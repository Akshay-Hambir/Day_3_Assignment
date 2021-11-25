package assignments1;

public class BookMain {
    private Book[] books;
    public void createBook(int n){
        books = new Book[n];
        books[0] = new Book();
        books[1] = new Book();

        books[0].setBookTitle("java Programming");
        books[0].setPrice(350.50f);

        books[1].setBookTitle("Let Us C");
        books[1].setPrice(200.00f);
    }

    public void showBooks(){
        System.out.println("Book Title \t Book Price");
        for(Book b: books ){
            System.out.println(b.getBookTitle()+" \t "+b.getPrice());
        }
    }
    public static void main(String[] args) {
        int n;
        n=2;
        BookMain bm = new BookMain();
        bm.createBook(n);
        bm.showBooks();
    }
}
