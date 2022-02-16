package org.howard.edu.lsp.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Token {
    
    public static void main(String[] args) {
        System.out.println("String?");
        
        Scanner sc = new Scanner(System.in); 
        
        
        
        int[] nums = new int[3];
        int i, loop;
        int sum=0;
        int prod = 1;
        boolean quit = false;
        
        while (quit == false) {
        	for (i=0; i<nums.length;i++) {
            nums[i] = sc.nextInt();
            sum+=nums[i];
            prod*=nums[i];
        }
        System.out.println("Tokens:"); 
        
        for (int element: nums) {
        	System.out.println(element);
        }
        
        System.out.println("Sum:" + sum);
        System.out.println("Product:" + prod);
    };
    	if(sc.equals("quit")) {
    		System.exit(0);
        	
        }
    }
    
}