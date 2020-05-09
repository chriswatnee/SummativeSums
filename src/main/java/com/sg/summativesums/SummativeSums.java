/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.summativesums;

/**
 *
 * @author christopherwatnee
 */
public class SummativeSums {
    
    public static void main(String[] args) {
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
        
        int[][] arrays = {array1, array2, array3};
        
        // Loop through arrays array
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("#" + (i + 1) + " Array Sum: " + calculateArraySum(arrays[i]));
        }
    }
    
    public static int calculateArraySum(int[] arr) {
        int sum = 0;
        // Loop through array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];// Add element value to sum
        }
        return sum;
    }
}
