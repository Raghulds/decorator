package Cones;

import Interfaces.IcecreamConstituents;

public class MangoCone implements IcecreamConstituents {

    IcecreamConstituents icecreamConstituents;
    public MangoCone() {}

    public MangoCone(IcecreamConstituents ic) {
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
            return "MangoCone";
        } else {
            return "MangoCone" + icecreamConstituents.getDescription();
        }
    }
}
