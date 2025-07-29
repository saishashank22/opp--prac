package Appleswap;

public class Appleswap {

	public static void main(String[] args) {
		 int jerryBag = 5;
	        int tomBag = 3;

	        
	        System.out.println("Before Swapping:");
	        System.out.println("Jerry's Bag: " + jerryBag + " apples");
	        System.out.println("Tom's Bag: " + tomBag + " apples");

	        
	        int temp = jerryBag;
	        jerryBag = tomBag;
	        tomBag = temp;

	  
	        System.out.println("After Swapping:\n");
	        System.out.println("Jerry's Bag: " + jerryBag + " apples");
	        System.out.println("Tom's Bag: " + tomBag + " apples");
	    }
	}