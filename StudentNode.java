public class StudentNode {
    String studentName;
    String studentId;
    StudentNode next;

    public StudentNode(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.next = null;
    }
}
