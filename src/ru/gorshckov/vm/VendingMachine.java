package ru.gorshckov.vm;
import ru.gorshckov.drink.ColdDrink;
import ru.gorshckov.drink.HotDrink;
import java.util.Scanner;

public class VendingMachine {
    private HotDrink drinks;

    public VendingMachine() {
    }

    public VendingMachine(HotDrink drinks) {
        this.drinks = drinks;
    }
    public void giveMeADrink(HotDrink drinks) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Вставьте купюру и выберите горячий напиток");
        int m = sc.nextInt();
        while (true) {
            if (m == drinks.price) {
                System.out.println("Возьмите ваш напиток: " + drinks.titleDrink);
            }
            if (m < drinks.price) {
                System.out.println("не хватает денег");

            }
            if (m > drinks.price ) {
                System.out.println("Возьмите ваш напиток: " + drinks.titleDrink + " "+ "и получите сдачу");
            }
            break;
        }
    }
    public void giveMeADrink(ColdDrink drinks) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Вставьте купюру и выберите холодный напиток");
        int m = sc.nextInt();
        while (true) {
            if (m == drinks.price1) {
                System.out.println("Возьмите ваш напиток: " + drinks.titleDrink1);
            }
            if (m < drinks.price1) {
                System.out.println("не хватает денег");
            }
            if (m > drinks.price1 ) {
                System.out.println("Возьмите ваш напиток: " + drinks.titleDrink1 + " "+ "и получите сдачу");
            }
            break;
        }
    }
}

