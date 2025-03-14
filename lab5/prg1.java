class libraryItem { // BASE CLASS
    String title;
    int id;
    boolean checkedOut;

    libraryItem(String title, int id, boolean checkedOut) {
        this.title = title;
        this.id = id;
        this.checkedOut = checkedOut;
    }

    void check() {
        System.out.println(id + " " + title + " " + checkedOut);
    }

    void returnItem() {
        checkedOut = false;
        System.out.println(title + "is returned with id " + id);
    }
}

// DERIVED CLASSES
class Book extends libraryItem {    
    String author;

    Book(String title, int id, boolean checkedOut, String author) {
        super(title, id, checkedOut);
        this.author = author;
    }

    void displayInfo() {
        System.out.println(id + " " + title + " " + author + " " + checkedOut);
    }
}

class DVD extends libraryItem {
    String director;

    DVD(String title, int id, boolean checkedOut, String director) {
        super(title, id, checkedOut);
        
        this.director = director;
    }

    void displayInfo() {
        System.out.println(id + " " + title + " " + director + " " + checkedOut);
    }
}

class Journal extends libraryItem {
    String issueNumber;

    Journal(String title, int id, boolean checkedOut, String issueNumber) {
        super(title, id, checkedOut);
        
        this.issueNumber = issueNumber;
    }

    void displayInfo() {
        System.out.println(id + " " + title + " " + issueNumber + " " + checkedOut);
    }
}

public class prg1 {
    public static void main(String args[]) {
        Book obj1 = new Book("Power of Subconsious mind", 112, true, "Joseph Murphy");
        Journal obj2 = new Journal("The Diary of a young girl", 223, true, "Anne Frank");
        DVD obj3 = new DVD("Pirates of Carribbean", 331, false, "Dead man's chest");

        System.out.println("Check functions: ");
        obj1.check();
        obj2.check();
        obj3.check();

        System.out.println("Display Info: ");
        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();

        obj2.returnItem();
        
        obj1.returnItem();
        obj2.displayInfo();
        obj3.returnItem();


        System.out.println(obj1.getClass().getName());
        System.out.println(obj1.getClass());
    }
}