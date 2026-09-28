/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 27810
 */
public abstract class Console implements Iconsoles{
    private String consoleType;
    private String store;
    private int TotalSales;
    
    public Console(String consoleType, String store, int TotalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }
    @Override
    public String getConsoleType() {
        return consoleType;
    }
    @Override
    public String getStore() {
        return store;
    }
    @Override
    public int getTotalSales(int totalSales) {
        return totalSales;
    }
    public abstract void printReport();
    
}
