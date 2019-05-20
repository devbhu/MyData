package dp.template;

public class TextFile implements Processor {
    @Override
    public void readData() {
        System.out.println("reading data from text file");
    }

    @Override
    public void processData() {
        System.out.println("processing text data ");
    }
}
