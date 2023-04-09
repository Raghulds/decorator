package Toppings;

import Interfaces.IcecreamConstituents;

public class BlackcurrantTopping implements IcecreamConstituents {

    IcecreamConstituents icecreamConstituents;
    public BlackcurrantTopping(IcecreamConstituents ic) {
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
            return "BlackcurrantTopping ";
        } else {
            return "BlackcurrantTopping " + icecreamConstituents.getDescription();
        }
    }
}
