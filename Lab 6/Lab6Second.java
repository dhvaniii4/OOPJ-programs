public class Lab6Second {
    public static void main(String[] args) {
        if (args.length == 3) {
            Book b1;
            if (args[1].equalsIgnoreCase("Book")) {
                b1 = new book_publication(args[0], args[2]);
            } else if (args[1].equalsIgnoreCase("Paper")) {
                b1 = new paper_publication(args[0], args[2]);
            } else {
                b1 = new Book(args[0]);
            }
            b1.printDetails();
        } else if (args.length == 1) {
            Book b1 = new Book(args[0]);
            b1.printDetails();
        } else {
            System.out.println("Invalid Details!");
        }
    }
}

class Book {
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    void printDetails() {
        System.out.println("Author Name : " + this.author_name);
    }
}

class book_publication extends Book {
    private String title;

    book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;

    }

    void printDetails() {
        System.out.println("---- Book Publication ----");
        super.printDetails();
        System.out.println("Title : " + this.title);
    }
}

class paper_publication extends Book {
    private String title;

    paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void printDetails() {
        System.out.println("---- Paper Publication ----");
        super.printDetails();
        System.out.println("Title : " + this.title);
    }
}