/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 27810
 */
public class ConsoleSales extends Console{
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }
    @Override
    public void printReport() {
        System.out.println("-----------");
        System.out.println("Console sales report");
        System.out.println("-------------");
        System.out.println("Console type: " + getConsoleType());
        System.out.println("Store: " + getStore());
        System.out.println("Total sales: " + getTotalSales());
        System.out.println("-------------");
    }

   
    }
    
}
