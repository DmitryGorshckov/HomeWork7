package ru.gorshckov.drink;

public enum HotDrink {
    COFFEE("кофе",30), DARKTEA("черныйЧай",15), GREENTEA("зеленыйЧай",10);
    public String titleDrink;
    public int price;

    HotDrink(String nameTitle, int price) {
        this.titleDrink = nameTitle;
        this.price = price;
    }
}
