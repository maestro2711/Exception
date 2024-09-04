package org.example;

public class Main {


    public static void main(String[] args) {

        System.out.println("Kunde: Durst");
        String beverage = null;
        try {
            beverage = orderFromWaiter();
        }catch (Exception e) {
            System.out.println("Kunde: Genießt " + beverage);
        }

    }

    public static String orderFromWaiter() throws Exception {
        System.out.println("Kellner: Bestellung aufgenommen");
        String beverage = getBeverageFromFridge();
        System.out.println("Kellner: " +beverage+ "geholt");
        return " ein  kalstes " +beverage;
    }
    public static String getBeverageFromFridge() throws Exception{
        throw new Exception();
    }

}