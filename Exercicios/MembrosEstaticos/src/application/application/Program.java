package application;

import java.util.Locale;
import java.util.Scanner;

import calculator.CurrencyConverter;

public class Program {

        public static void main(String[] args) {
            
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currencyConverter = new CurrencyConverter();
        System.out.print("What is the dollar price? ");
        currencyConverter.price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        currencyConverter.bought = sc.nextDouble();

        System.out.println("Amount to be paid in reais: " + currencyConverter.amountReais());

        sc.close();
        }
}
