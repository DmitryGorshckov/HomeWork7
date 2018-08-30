package ru.gorshckov.drink;

public enum ColdDrink {
    COLA("кола",60), SPRITE("спрайт",50), PEPSI("пепси",55);
    public String titleDrink1;
    public int price1;

    ColdDrink(String nameTitle1, int price1) {
        this.titleDrink1 = nameTitle1;
        this.price1 = price1;
    }
}
