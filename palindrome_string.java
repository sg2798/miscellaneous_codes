import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sourabh gupta
 */


//CODE NO 1
public class palindrome_string {
   public static String removal(String b,int pos){
       String a="";
       for(int i=0;i<pos;i++){
          a=a+b.charAt(i);
       }
       for(int j=pos+1;j<b.length();j++){
          a=a+b.charAt(j);
       }
       return a;
   }
   
   //CODE NO 2
    public static boolean checkPal(String a){
         boolean chk=false;
         int l=a.length();
         String b="";
         for(int i=l-1;i>=0;i--){
             b=b+a.charAt(i);
         }
         if(b.equals(a)){
         chk= true;
         }
        return chk; 
     }
    
    //CODE NO 3
    public class StringPermutations { 
          private void permutation(String perm, String word) { 
           if (word.isEmpty()) {
               System.err.println(perm + word); 
           } 
           else { 
               for (int i = 0; i<word.length(); i++) {
               permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); }
           }
       }
       public void permutation(String input){ 
           permutation("", input); 
       } 
     
    }
    
    //CODE NO 4 RECURSIVE PREMUTATIONS
   static boolean isPalRec(String str,  
                            int s, int e) 
    { 
        // If there is only one character 
        if (s == e) 
            return true; 
  
        // If first and last  
        // characters do not match 
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false; 
  
        // If there are more than  
        // two characters, check if 
        // middle substring is also 
        // palindrome or not. 
        if (s < e + 1) 
            return isPalRec(str, s + 1, e - 1); 
  
        return true; 
    } 
  
    static boolean isPalindrome(String str) 
    { 
        int n = str.length(); 
  
    // An empty string is  
    // considered as palindrome 
        if (n == 0) 
            return true; 
  
        return isPalRec(str, 0, n - 1); 
    } 
  
   
    
   //CODE NO 5 occcurence count
    
      public static int count(String s, char c) 
    { 
        int res = 0; 
  
        for (int i=0; i<s.length(); i++) 
        { 
            // checking character in string 
            if (s.charAt(i) == c) 
            res++; 
        }  
        return res; 
    } 
      

    public static void main(String args[] ){
    //for recursive permutation  
       String str = "geeg"; 
  
        if (isPalindrome(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
        
        String sr= "helloworld"; 
        char c = 'l'; 
        System.out.println(count(str, c));
    }
}
