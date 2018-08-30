import ru.gorshckov.drink.ColdDrink;
import ru.gorshckov.drink.HotDrink;
import ru.gorshckov.vm.VendingMachine;

public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.giveMeADrink(HotDrink.DARKTEA);
        vm.giveMeADrink(ColdDrink.COLA);

    }
    }
