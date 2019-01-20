/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sourabh gupta
 */
public class codesnew {
//CODE NO 1
    public static boolean anagram(String test1,String test2){
        boolean check =false;
        int count=0;
        char arr[]=new char[test1.length()];
// CASE OF  EQUAL LETTERED WORDS        
        if(test1.length()==test2.length()){
             for(int i=0;i<test1.length();i++){
                 arr[i]=test2.charAt(i);
             }
//comparing the strings 
             for(int i=0;i<test1.length();i++){
                 char a=test1.charAt(i);
                 for(int j=0;j<i;j++){
                     if(a==arr[j]){
                         count++;
                     }
                 }
             }
             if(count==test1.length()){
                 check=true;
             }
        }
        
        return check;
    }
//CODE NO 2 
//counting no of alphabets
    public static void letterCount(String test){
        char arr[]=new char[test.length()];
        for(int i=0;i<test.length();i++){
            arr[i]=test.charAt(i);
        }
        for(int i=0;i<test.length();i++){
            int count=0;
            for(int j=0;j<test.length();j++){
                if(arr[i]==test.charAt(j)){
                    count++;
                }
            }
            System.out.println("occurence of"+arr[i]+"is"+count);
        }
    }
//CODE NO 3
//PRINTING THE SECOND LARGEST NUMBER
    public static void printSecondLargest(int arr[],int arr_size){ 
        int i, first, second; 
       
        /* There should be atleast two elements */
        if (arr_size < 2) 
        { 
            System.out.print(" Invalid Input "); 
            return; 
        } 
       
        first = second = Integer.MIN_VALUE; 
        for (i = 0; i < arr_size ; i++) 
        { 
            /* If current element is smaller than  
            first then update both first and second */
            if (arr[i] > first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
       
            /* If arr[i] is in between first and  
               second then update second  */
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        } 
          
        if (second == Integer.MIN_VALUE) 
             System.out.print("There is no second largest"+ 
                                 " element\n"); 
        else
             System.out.print("The second largest element"+ 
                                      " is "+ second); 
    } 
    
    public static void main(String args[]){
           letterCount("attaarr");
           System.out.println(anagram("hello","ollhe"));
           int arr[]={10,12,33,21,2,4};
           printSecondLargest(arr,6);
    }
}
