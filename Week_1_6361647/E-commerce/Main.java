// File: Main.java
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Beauty"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Chair", "Furniture"),
            new Product(105, "Mouse", "Electronics")
        };

        // Linear search
        Product foundLinear = Search.linearSearch(products, "Mouse");
        System.out.println("Linear Search Result: " + foundLinear);

        // Sort first before binary search
        Search.sortByName(products);

        // Binary search
        Product foundBinary = Search.binarySearch(products, "Mouse");
        System.out.println("Binary Search Result: " + foundBinary);
    }
}

