package com.xworkz.arraysclass;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysClass {
       public static void main(String a[]) {
    	   
    	  String arr[]= {"Bengaluru","Mysore","Shimoga"}; 
    	  Arrays.sort(arr);
    	  for(int i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
    	  }  
    	  
    	  int arr1[]= {34,54,63,7};
    	  Arrays.sort(arr1);
    	  for(int i=0;i<arr1.length;i++) {
    		  System.out.println(arr1[i]);
    	  }
    	  
    	  
    	  char arr2[]= {'e','y','o','p'};
    	  Arrays.sort(arr2);
    	  for(int i=0;i<arr2.length;i++) {
    		  System.out.println(arr2[i]);
    	  }
    	  
    	  byte arr3[]= {6,7,4,5};
    	  Arrays.sort(arr3);
    	  for(int i=0;i<arr3.length;i++) {
    		  System.out.println(arr3[i]);
    	  }
    	  
    	  double arr4[]= {2.3,4.5,6.7,9.76};
    	  Arrays.sort(arr4);
    	  for(int i=0;i<arr4.length;i++) {
    		  System.out.println(arr4[i]);
    	  }
    	  
    	  short arr5[]= {3,4,5,6,0};
    	  Arrays.sort(arr5);
    	  for(int i=0;i<arr5.length;i++) {
    		  System.out.println(arr5[i]);
    	  }
    	  
    	  long arr6[]= {3456,6788,234,25689};
    	  Arrays.sort(arr6);
    	  for(int i=0;i<arr6.length;i++) {
    		  System.out.println(arr6[i]);
    	  }
    	  
  
    	  //converting any type of array to string type
    	  System.out.println(Arrays.toString(arr6));
    	  System.out.println(Arrays.toString(arr3));
    	  System.out.println(Arrays.toString(arr2));
    	  System.out.println(Arrays.toString(arr4));
          System.out.println(Arrays.toString(arr1)); 
          System.out.println(Arrays.toString(arr5));
          
          
       }
} 
   
