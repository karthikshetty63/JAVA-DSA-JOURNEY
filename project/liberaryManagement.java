package project;
// liberary management project

public class liberaryManagement {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook();
        printedBook.setTitle("Java Basics");
        printedBook.setAuthor("James Gosling");
        printedBook.setPrice(150);
        printedBook.setNumberOfPages(120);

        System.out.println("Printed Book:");
        System.out.println("Title: " + printedBook.getTitle());
        System.out.println("Author: " + printedBook.getAuthor());
        System.out.println("Price: " + printedBook.getPrice());
        System.out.println("Pages: " + printedBook.getNumberOfPages());

        EBook ebook = new EBook();
        ebook.setTitle("Data Structures");
        ebook.setAuthor("Karthik");
        ebook.setPrice(180);
        ebook.setFilesize(2);

        System.out.println("\nEBook:");
        System.out.println("Title: " + ebook.getTitle());
        System.out.println("Author: " + ebook.getAuthor());
        System.out.println("Price: " + ebook.getPrice());
        System.out.println("File size: " + ebook.getFilesize() + " MB");
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price >= 100 && price <= 200) {
            this.price = price;
        } else {
            System.out.println("The cost must be between 100 and 200.");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class PrintedBook extends Book {
    private int numberOfPages;

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages >= 5) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("Invalid page size.");
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

class EBook extends Book {
    private int filesize;

    public void setFilesize(int filesize) {
        if (filesize < 3) {
            this.filesize = filesize;
        } else {
            System.out.println("File size is too large.");
        }
    }

    public int getFilesize() {
        return filesize;
    }
}