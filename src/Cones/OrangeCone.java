package Cones;

import Interfaces.IcecreamConstituents;

public class OrangeCone implements IcecreamConstituents {

    IcecreamConstituents icecreamConstituents;
    public OrangeCone() {}

    public OrangeCone(IcecreamConstituents ic) {
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
            return "OrangeCone";
        } else {
            return "OrangeCone" + icecreamConstituents.getDescription();
        }
    }
}
