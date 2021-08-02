package com.company;

// this class is dumbed down version of the original arraylist package, so some method will not be here
public class ArrayList1<T> {
	// Attributes
	private T[] arr2;
	private T[] arr;
	private int size;

	// this constructor take an input
	public ArrayList1(T[] array){
		arr = array;
		checkSize(arr);
	}
	// this constructor does not take an input
	public ArrayList1(){
		 arr = (T[]) new Object[10];
		 checkSize(arr);
	}


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
	// calculate the number of elements in the array
	public void checkSize(T[] array){
		size = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i] == null){
				break;
			}
			size++;
		}

	}
	// returns how many elements are in the array
	public int size(){
		return size;
	}

	// tells the user if the array is empty or not
	public boolean isEmpty(){
		if (arr[0] != null){
			return false;
		}
		return true;
	}

	// appends to the end of the array
	public void add(T ele) {
		resize();
		arr[size] =  ele;
		size++;
	}
	// selection a specific location to insert variable into array
	public void add(int tar, T ele){
		resize();
		for (int i = tar; i < size; i++){
			arr[i+1] = arr[i];

		}
		arr[tar]=ele;
		size++;

	}
	// replace the targeted index with something else the user provides
	public void change(int tar, T ele){
		arr[tar] = ele;
	}


	// wipes the entire list
	public void clear(){
		arr2 = (T[]) new Object[10];
		arr = arr2;
		size = 0;
	}
	// user tells us where the element is removed
	public void remove(int ele){
		for (int i = ele; i < size; i++){
			arr[i] = arr[i+1];
		}
		size--;
		arr[size] = null;
	}
	// take a section of the array that the user wants to keep and gets rid of the rest
	public void trim(int frontIndex, int endIndex){
		size = 0;
		T[] arr3 = (T[]) new Object[endIndex-frontIndex+1]; // add 1 cause we wan tour endIndex to be in the new array

		for (int i =frontIndex; i <= endIndex; i++){
			arr3[i-frontIndex] = arr[i];
			size++;
		}
		arr= arr3;
	}

	// return the desired index and show what element is there
	public T get(int i){ return arr[i]; }

	// will return the array
	public String toArray(){
		String output = "";
		for (int i = 0; i < size; i++){
			output+=arr[i]+ " ";

		}
		return output;
	}




}

