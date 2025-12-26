public class TeacherNode {
    String teacherName;
    String teacherId;
    String courseId;
    TeacherNode next;

    public TeacherNode(String teacherName, String teacherId, String courseId) {
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.courseId = courseId;
        this.next = null;
    }
}
