import java.util.ArrayList;

// Class Name: PascalCase and a Noun (Java Naming Convention)
class Book {
    String title;
    double price;

    // Constructor: Same name as class, no return type (Screenshot Concept)
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}

public class DigitalLibrarian {

    public static void main(String[] args) {
        // 1. Using an ArrayList (The Java version of JS Arrays)
        ArrayList<Book> library = new ArrayList<>();

        // Adding items using our Constructor
        library.add(new Book("Java Fundamentals", 499.0));
        library.add(new Book("Recursion Secrets", 299.0));
        library.add(new Book("The Coding Monk", 150.0));

        System.out.println("--- Welcome to the Digital Library ---");

        // 2. Iteration Statement: For-each loop (Screenshot Concept)
        double totalValue = 0;
        for (Book b : library) {
            System.out.println("Book: " + b.title + " | Price: Rs." + b.price);

            // 3. Arithmetic Operator: Addition Assignment (+=)
            totalValue += b.price;
        }

        // 4. Data Operations: Division to find average
        double average = totalValue / library.size();
        System.out.println("\nTotal Library Value: Rs." + totalValue);
        System.out.println("Average Book Price: Rs." + average);

        // 5. Selection Statement: If-Else (Screenshot Concept)
        if (average > 300) {
            System.out.println("Status: Premium Collection");
        } else {
            System.out.println("Status: Budget Collection");
        }

        System.out.println("\nClosing library in...");
        // 6. Jump to Recursion
        startClosingCountdown(3);
    }

    // 7. Recursion: Function calling itself (Screenshot Concept)
    static void startClosingCountdown(int n) {
        if (n == 0) { // Base Case
            System.out.println("LOCKED. Goodbye!");
            return;
        }
        System.out.println(n + "...");
        startClosingCountdown(n - 1); // Recursive call
    }
}
