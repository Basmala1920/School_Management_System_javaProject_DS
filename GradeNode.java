// Node class for storing a Student in Grade linked list
public class GradeNode {
    public Student student;
    public GradeNode pointer;

    public GradeNode(Student data) {
        this.student = data;
        this.pointer = null;
    }
}
