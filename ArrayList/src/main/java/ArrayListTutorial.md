# Java ArrayList

The ArrayList class is a resizable array, which can be found in the java.util package.


## The Basics of ArrayList  


### How ArrayList works

1. To begin
    ```java
    import java.util.ArrayList; // import the ArrayList class
    
    public class Main {
        public static void main(String[] args) {
            ArrayList<String> fruit = new ArrayList<>(); // Create an ArrayList object
            }
    }
    ```
    - So above we import ArrayList from java.util package
    - Then we create the object for the new ArrayList
    
    
2. How to use some common methods for ArrayList
    
    -  Add to the ArrayList
    ```java
    import java.util.ArrayList; // import the ArrayList class
    
    public class Main {
        public static void main(String[] args) {
            ArrayList<String> fruit = new ArrayList<>(); // Create an ArrayList object
            fruit.add("pear");
            fruit.add("lime");
            fruit.add("peach");
            fruit.add("mango");
            System.out.println(fruit); // print out the ArrayList to see that they are there
            }
    }
    ```
    
    - Get element from the ArrayList
    ```java
    fruit.get(0); // this will retrieve pear from the ArrayList by refering to the index
    ```
    
    - Remove from the ArrayList
    ```java
    fruit.remove(0); // this will remove pear from the ArrayList by refering to the index
    ```
    
    - Remove all from the ArrayList
    ```java
    fruit.clear(); // this will remove all elements in the ArrayList
    ```
    
    - The size of ArrayList
    ```java
    fruit.size(); // this give the ArrayList length
    ```
    
    - Sort the ArrayList
    ```java
    import java.util.Collections;  // Import the Collections class
    Collections.sort(fruit); // this sort the ArrayList fruit
    ```
    
3. How to loop through an ArrayList
    
    - So this will start at the begginning and end when it comes to the end of the ArrayList
    ```java
    for (String i : fruit) {
      System.out.println(i); // will print out each element
    }
    ```
- Try using different variation of the methods in order to grasp the ArrayList
- For more method and a better understanding check out [Oracle Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)



### Pros and Cons of ArrayList

1. Pros
    
    - resizable

2. Cons

    - If a data entry is added to or removed from an array-based list, data needs to be shifted to update the list.



### Space and Time Complexity

- When we search any value in ArrayList we have to iterate through all elements. This operation has O(N) time complexity.
- However when we use add() to the ArrayList and the time complexity is O(1) becuase we just add it to the end, so we know where it is going
- An ArrayLists space usage is not directly proportional to the list size. It has a "double the size when full" strategy for their space utilization.