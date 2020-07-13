package dp.adapter;

public class School {
    public static void main(String a[]){
        Pen pen = new PenAdapter(new PilotPen());
        AssignmentWork assignmentWork = new AssignmentWork(pen);
        assignmentWork.writeAssignment("Writing assignemnt using pilot pen");
    }
}
