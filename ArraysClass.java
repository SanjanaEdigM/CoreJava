package com.xworkz.arraysclass;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysClass {
       public static void main(String a[]) {
    	   
    	   //sorting arrys in ascending order
    	  System.out.println("arrays sorting in ascending order"); 
    	  
    	  String arr[]= {"Bengaluru","Mysore","Shimoga"}; 
    	  Arrays.sort(arr);
    	  for(int i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in descending order"); 
    	  Arrays.sort(arr,Collections.reverseOrder());
    	  for(int i=0;i<arr.length;i++) {
       	   System.out.println(arr[i]);
       	  }
    	  
    	  System.out.println("arrays sorting in ascending order"); 
    	  int arr1[]= {34,54,63,7};
    	  Arrays.sort(arr1);
    	  for(int i=0;i<arr1.length;i++) {
    		  System.out.println(arr1[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in descending order"); 
    	  Integer arr2[]= {34,54,63,7};
    	  Arrays.sort(arr2,Collections.reverseOrder());
    	  for(int i=0;i<arr2.length;i++) {
    		  System.out.println(arr2[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in ascending order"); 
    	  char arr3[]={'e','y','o','p'};
    	  Arrays.sort(arr3);
    	  for(int i=0;i<arr3.length;i++) {
    		  System.out.println(arr3[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in descending order"); 
    	  Character arr4[]= {'e','y','o','p'};
    	  Arrays.sort(arr4,Collections.reverseOrder());
    	  for(int i=0;i<arr4.length;i++) {
    		  System.out.println(arr4[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in ascending order"); 
    	  byte arr5[]= {6,7,4,5};
    	  Arrays.sort(arr5);
    	  for(int i=0;i<arr5.length;i++) {
    		  System.out.println(arr5[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in descending order");
    	  Byte arr7[]={1,7,4,5};
    	  Arrays.sort(arr7,Collections.reverseOrder());
    	  for(int i=0;i<arr7.length;i++) {
    		  System.out.println(arr7[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in ascending order"); 
    	  double arr8[]= {2.3,4.5,6.7,9.76};
    	  Arrays.sort(arr8);
    	  for(int i=0;i<arr8.length;i++) {
    		  System.out.println(arr8[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in descending order");
    	  Double arr9[]={2.3,4.5,6.7,9.76};
    	  Arrays.sort(arr9,Collections.reverseOrder());
    	  for(int i=0;i<arr9.length;i++) {
    		  System.out.println(arr9[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in ascending order"); 
    	  short arr10[]= {3,4,5,6,0};
    	  Arrays.sort(arr10);
    	  for(int i=0;i<arr10.length;i++) {
    		  System.out.println(arr10[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in descending order");
    	  Short arr11[]={3,4,5,6,0};
    	  Arrays.sort(arr11,Collections.reverseOrder());
    	  for(int i=0;i<arr11.length;i++) {
    		  System.out.println(arr11[i]);
    	  }
    	  
    	  
    	  System.out.println("arrays sorting in ascending order"); 
    	  long arr12[]= {3456,6788,234,25689};
    	  Arrays.sort(arr12);
    	  for(int i=0;i<arr12.length;i++) {
    		  System.out.println(arr12[i]);
    	  }
    	  
    	  System.out.println("arrays sorting in descending order");
    	  Integer arr13[]={3456,6788,234,25689};
    	  Arrays.sort(arr13,Collections.reverseOrder());
    	  for(int i=0;i<arr13.length;i++) {
    		  System.out.println(arr13[i]);
    	  }
  
    	  

    	  //converting any type of array to string type
    	  System.out.println("**********converting array to string type");
    	  
    	  System.out.println(Arrays.toString(arr7));
    	  System.out.println(Arrays.toString(arr3));
    	  System.out.println(Arrays.toString(arr2));
    	  System.out.println(Arrays.toString(arr4));
          System.out.println(Arrays.toString(arr1)); 
          System.out.println(Arrays.toString(arr5));
          
          
       }
} 
   
