/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sourabh gupta
 */

//CODE TO PRINT LARGEST AND SMALLEST NUMBER OF AN ARRAY
public class codesnew2 {
    public static void comparison(int arr[]){
        int largest=0,smallest=arr[0];
        int test;
        for(int i=0;i<arr.length;i++){
            test=arr[i];
            if(test>largest){
                largest=test;
            }
            if(test<smallest){
               smallest=test; 
            }
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The smallest number is "+smallest);
    }
    
//CODE TO PRINT THE SECOND LARGEST NUMBER IN THE ARRAY  
    public static void secondLargest(int arr[]){
        int largest = arr[0];
	int secondLargest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                 if (arr[i] > largest) {
		   secondLargest = largest;
		   largest = arr[i];
                 } 
                 else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
                       }
	    }
        System.out.println("\nSecond largest number is:" + secondLargest);
    }
    
//BUBBLE SORT //
    public static void swap(int a,int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
    }
    public static void bubbleSort(int arr[]){
        
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
        System.out.println(arr);
    }
    
//MAIN METHOD
    public static void main(String args[]){
        int arr[]={10,11,255,12,33};
        comparison(arr);
        secondLargest(arr);
        bubbleSort(arr);
    }
}
