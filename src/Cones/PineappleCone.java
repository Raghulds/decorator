package Cones;

import Interfaces.IcecreamConstituents;

public class PineappleCone implements IcecreamConstituents {

    IcecreamConstituents icecreamConstituents;
    public PineappleCone() {}

    public PineappleCone(IcecreamConstituents ic) {
        this.icecreamConstituents = ic;
    }

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
            return "PineappleCone";
        } else {
            return "PineappleCone" + icecreamConstituents.getDescription();
        }
    }
}
