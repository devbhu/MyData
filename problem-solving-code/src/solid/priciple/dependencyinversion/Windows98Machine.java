package solid.priciple.dependencyinversion;

public class Windows98Machine {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }

}

//Above class should be implemented as below
class Windows98MachineWithDI {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98MachineWithDI(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

