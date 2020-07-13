package dp.adapter;

public class AssignmentWork {
    Pen pen;

    public AssignmentWork(Pen pen) {
        this.pen = pen;
    }
     protected void writeAssignment(String text){
         pen.write(text);
     }
}
