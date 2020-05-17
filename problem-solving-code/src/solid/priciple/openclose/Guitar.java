package solid.priciple.openclose;

public class Guitar {

        private String make;
        private String model;
        private int volume;

        //Constructors, getters & setters
}

/**
 * Guitar is open for extension and closed for modification
 */
class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    //constructor, getters + setters
}