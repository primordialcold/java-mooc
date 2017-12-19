import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;

    public Library(){
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        library.add(newBook);
    }

    public void printBooks(){
        for(Book books : library){
            System.out.println(books);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : library){
//            if(book.toString().contains(title)){
//                found.add(book);
//            }
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : library){
//            if(book.toString().contains(publisher)){
//                found.add(book);
//            }
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        String rok = "";
        rok += year;
        for(Book book : library){
            if(book.toString().contains(rok)){
                found.add(book);
            }
        }
        return found;
    }

}
