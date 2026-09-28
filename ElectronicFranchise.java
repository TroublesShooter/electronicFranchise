/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicfranchise;

/**
 *
 * @author 27810
 */
public class ElectronicFranchise {

    public static void main(String[] args) {
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] console = {"PS5", "XBOX", "SWITCH"}; 
        
        int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};
        
        int[] totals = new int[cities.length];
        String line = "-".repeat(60);
        
        //report
        System.out.println(line);
        System.out.println("Gaming console report");
        System.out.println(line);
        
        //electronics names
        System.out.printf("%-18s", "");
        
        
        for (String console: consoles){
            System.out.printf("%-14s", console);
        }
        System.out.println();
        for (int row=0;row<cities.length;row++){
            System.out.printf("%-18s", cities[row]);
            for (int col=0;col<console.length;col++);
            int col = 0;
            System.out.printf("%-14d", sales[row][col]);
            totals[row] += sales[row][col];
        }
        System.out.println();      
    }
    //total for each city
    System.out.println(line);
    System.out.println("console totals for each city");
    System.out.println(line);
    
    for (int i= 0;i <cities.length;i++){
         System.out.printf("%-18s%d%n", cities[i], totals[i]);
    
    }
    int highestIndex = 0;
    for (int i= 1;i <totals.length;i++){
    if (totals[i]>totals[highestIndex]){
       highestIndex = i;
   }
}
    System.out.println();
    Systm.out.println("City with most sales: " + cities[highestIndex]);
    System.out.println();
    
}
