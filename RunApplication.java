
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 27810
 */
public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] consoleType = {"PS5", "XBOX", "SWITCH"};
        
        System.out.println("Select a console device type:");
        for (int i=0;i<consoleType;i++){
            System.out.println((i + 1) + "." + consoleType[i]);
        }
        int choice = 0;
        while (choice<1||choice>consoleTypes.length) {
            System.out.print("Enter choice (1-" + consoleTypes.length + "): ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
            }else {
                input.next();
            }
        }
        input.nextLine();
        
        System.out.print("Enter the store name: ");
        String store = input.nextLine();
        
        int totalSales = -1;
        while (totalSales<0) {
            System.out.print("Enter the total amount of sales: ");
            if (input.hasNextInt()){
                totalSales = input.nextInt();
            }else{
                input.next();
            }
        }
        consoleSales sales = new ConsoleSales(consoleTypes[choice - 1], store, totalSales);
        System.out.println();
        sales.printReport();
    }
    
}
