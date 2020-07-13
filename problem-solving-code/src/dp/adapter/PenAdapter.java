package dp.adapter;

public class PenAdapter implements Pen{
    PilotPen pilotPen;

    public PenAdapter(PilotPen pilotPen) {
        this.pilotPen = pilotPen;
    }

    @Override
    public void write(String text) {
        pilotPen.mark(text);
    }
}
