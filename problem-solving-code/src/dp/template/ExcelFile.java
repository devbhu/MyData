package dp.template;

public class ExcelFile implements Processor {
    @Override
    public void readData() {
        System.out.println("reading data from excel file");
    }

    @Override
    public void processData() {
        System.out.println("processing excel data ");
    }
}
