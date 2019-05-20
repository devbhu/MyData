package dp.template;

public class TestTemplate {
    public static void main(String arg[]) {
        Processor processor = new ExcelFile();
        processor.process();
        processor = new TextFile();
        processor.process();
    }
}
