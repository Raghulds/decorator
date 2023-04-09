import Cones.OrangeCone;
import Interfaces.IcecreamConstituents;
import Toppings.BlackcurrantTopping;
import Toppings.StrawberryTopping;

public class Main {
    public static void main(String[] args) {

        IcecreamConstituents icecream = new StrawberryTopping(
                new BlackcurrantTopping(
                        new OrangeCone()
                )
        );
        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
}