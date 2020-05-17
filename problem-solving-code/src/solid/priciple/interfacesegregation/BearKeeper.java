package solid.priciple.interfacesegregation;

public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}
// above interface can be segregated as below

interface BearCleaner {
    void washTheBear();
}

interface BearFeeder {
    void feedTheBear();
}

interface BearPetter {
    void petTheBear();
}

class BearCarer implements BearCleaner, BearFeeder {

    public void washTheBear() {
        //I think we missed a spot...
    }

    public void feedTheBear() {
        //Tuna Tuesdays...
    }
}

class CrazyPerson implements BearPetter {

    public void petTheBear() {
        //Good luck with that!
    }
}