package Day10;
// Problem Statement:
//  Develop a Book-EBook inheritance model where e-books have file sizes in MB but need conversion to KB.
// Book base class: title, author, price.
// EBook subclass: fileSizeMB.
// Implement convertFileSize() to convert MB to KB using: fileSizeMB * 1024.
// Use a parameterized constructor in both classes.
// Sample Input:
// EBook ebook = new EBook("Learning Java", "John Doe", 699, 5);
// ebook.convertFileSize();

// Expected Output:
// Book Title: Learning Java
// Author: John Doe
// Price: ₹699
// File Size: 5 MB (Converted: 5120 KB)

// Base class: Book
class Book {
    protected String title;
    protected String author;
    protected double price;

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

// Subclass: EBook
class EBook extends Book {
    private int fileSizeMB;

    // Parameterized constructor with constructor chaining
    public EBook(String title, String author, double price, int fileSizeMB) {
        super(title, author, price);  // Call to base class constructor
        this.fileSizeMB = fileSizeMB;
    }

    // Method to convert MB to KB
    public void convertFileSize() {
        int fileSizeKB = fileSizeMB * 1024;
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: ₹%.0f\n", price);
        System.out.println("File Size: " + fileSizeMB + " MB (Converted: " + fileSizeKB + " KB)");
    }
}

// Main class

public class FileSizeConversion {
    public static void main(String[] args) {
        EBook ebook = new EBook("Learning Java", "John Doe", 699, 5);
        ebook.convertFileSize();
    }
}
