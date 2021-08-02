# Java ArrayList

The ArrayList class is a resizable array, which can be found in the java.util package.


## The Basics of Creating the ArrayList  


### So Building the ArrayList

1. To begin
   - create a new class in java named ArrayList
    ```java
    public class ArrayList {
        
    }
    ```
    - so, now we have our ArrayList class
    
    
2. Getting started
    
    -  So, now lets get ArrayList setup, so we can better understanding of how it works
    ```java
    
    public class ArrayList<T> {
        
        private T[] arr2;
        private T[] arr;
        private int size;
   
    }
    ```
   - so we just set up all our variables
   - the T in <T> is what we use when using generic method
   - basically the T allows us to use any parameter type, to allow this to be useful from a broad perspective
   
  
3. Setting the Constructors
   - so, in any class we want to use for the future we would want constructors to call upon
   
     ```java
      public class ArrayList<T> {

         private T[] arr2;
         private T[] arr;
         private int size;
   
         // this constructor does not take an input
         public ArrayList(T[] array){
         arr = array;
         checkSize(arr);
         }
         // this constructor does not take an input
         public ArrayList(){
            arr = (T[]) new Object[10];
            checkSize(arr);
         }
      }
   - so, now we have our constructors
   - the first one is arranged, so the user can pass in an array
   - the second one is arranged, so the user does not pass in an array
   - now since we have everything setup, lets begin, just ignore checkSize() we will get to it in a little bit
   

4. Setting up the Methods 
   - so now let begin with the behavior of the ArrayList
      - also, these methods you can copy and past under the constructor, but I suggest typing as that will help to grasp the concept
   1.  ```checkSize method```
     ```java
         // calculate the number of elements in the array
         public void checkSize(T[] array){
            size = 0;
            for (int i = 0; i < array.length; i++){
               if (array[i] == null){
                  break;
               }
               size++;
         }
   ```
   - so whats does this method do?
   - well it goes through the array checking for data types, but when it comes to find null it stops
   - so why do this? well the array.length tell us how big the array can get while size will tell us at which piont ends the elements
   - that is why we run this method everytime a constructor is called
   2.  ```size method```
   ```java
            // returns how many elements are in the array
	           public int size(){
		            return size;
            }
   ```
   - all this method does give the user the amount of elements in the array
   3.  ```resize method```
   ```java
            //reallocates the size of the array
	           public void resize(){
                if (size+1 >= arr.length){
                    arr2 = (T[]) new Object[arr.length*2];
                    for (int i = 0; i < size; i++){
                        arr2[i] = arr[i];
                    }
                    arr = arr2;
                }
            }
   ```
   - this method is run everytime we add an element to the array to make sure there is an index
   - if the size becomes greater than the length then the size of the array will double
   4.  ```add method```
   ```java
           // appends to the end of the array
	          public void add(T ele) {
		             resize();
		             arr[size] =  ele;
		             size++;
	           }
   ```
   - so the add method, we pass a parameter which than gets added, however first we run resize to make sure the index is available
   5.  ```add method```
   ```java
         // selection a specific location to insert variable into array
	        public void add(int tar, T ele){
		          resize();
		          for (int i = tar; i < size; i++){
			            arr[i+1] = arr[i];

		          }
		          arr[tar]=ele;
		          size++;

	        }
   ```
   - this method is basically the same as the one above, but we are overloading this method
   - so this method takes a target value and an element and inserts it into the location of the target and shifts the rest of the array
   6.  ```change method```
   ```java
         // replace the targeted index with something else the user provides
	        public void change(int tar, T ele){
		          arr[tar] = ele;
	        }
   ```
   - this method does not shift or add an element it just replaces the target value with the given element
   7.  ```clear method```
   ```java
          // wipes the entire list
	          public void clear(){
		             arr2 = (T[]) new Object[10];
		             arr = arr2;
		             size = 0;
	           }
   ```
   - this method does as it says, it wipes the entire array leaving it with size 0
   8.  ```remove method```
   ```java
               // tells the user when the element is removed
	              public void remove(int ele){
		                for (int i = ele; i < size; i++){
			                  arr[i] = arr[i+1];
		                }
		                size--;
		                arr[size] = null;
	              }
   ```
   - this method does what it says, it shifts the entire array to the left
   - and then put the final element to equal null because we want to make sure we have no unnecessary repeats
   9.  ``trim method```
   ```java
            // take a section of the array that the user wants to keep and gets rid of the rest
	           public void trim(int frontIndex, int endIndex){
		             size = 0;
		             T[] arr3 = (T[]) new Object[endIndex-frontIndex];

		             for (int i =frontIndex; i < endIndex; i++){
			               arr3[i-frontIndex] = arr[i];
			               size++;
		             }
		             arr= arr3;
            }
   ```
   - so this method simply does a selection, taking a part of the array and removing the rest
   10.  ``get method```
   ```java
            // return the desired index and show what element is there
	           public T get(int i){ return arr[i]; }
   ```
   - this methid just retrieves and returns the element in the requested index
   10.  ``ToArray method```
   ```java
            // will return the array
	           public void toArray(){
		             for (int i = 0; i < size; i++){
			               System.out.print(arr[i]+ " ");

		             }
		             System.out.println();
            }
   ```
   - the method just prints out the array, so the user can see what is in the array



- Try using different variation of the methods and adding your own in order to grasp the ArrayList
- also, we did try to make sorting method but that did not go to well, but the code is all there if your interested
- For more method and a better understanding check out [Oracle Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)



