public class Main {
    public static void main(String[] args) {
        DynamicArray<String> dynamicArray = new DynamicArray<>();

        // Adding elements
        dynamicArray.add("Book 1");
        dynamicArray.add("Book 2");
        dynamicArray.add("Book 3");

        // Print initial array
        dynamicArray.printArray();

        // Inserting an element
        dynamicArray.insert(1, "Book 4"); // Insert "Book 4" at index 1
        dynamicArray.printArray();

        // Removing an element
        String removedBook = dynamicArray.remove(2); // Remove element at index 2
        System.out.println("Removed: " + removedBook);
        dynamicArray.printArray();

        // Getting an element
        System.out.println("Element at index 1: " + dynamicArray.get(1)); // Should print "Book 4"

        // Size and emptiness check
        System.out.println("Size of array: " + dynamicArray.size()); // Should print 3
        System.out.println("Is array empty? " + dynamicArray.isEmpty()); // Should print false
    }
}