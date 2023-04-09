package Toppings;

import Interfaces.IcecreamConstituents;

public class StrawberryTopping implements IcecreamConstituents {

    IcecreamConstituents icecreamConstituents;

    public StrawberryTopping(IcecreamConstituents ic) {
        this.icecreamConstituents = ic;
    };
    @Override
    public int getCost() {
        if(icecreamConstituents == null) {
            return 20;
        } else {
            return 20 + icecreamConstituents.getCost();
        }
    }

    @Override
    public String getDescription() {
        if(icecreamConstituents == null) {
            return "StrawberryTopping ";
        } else {
            return "StrawberryTopping " + icecreamConstituents.getDescription();
        }
    }
}
