public class CourseNode {
    String courseName;
    String courseId;
    String teacherName;
    int numOfStudent;
    CourseNode next;

    public CourseNode(String courseName, String courseId, String teacherName, int numOfStudent) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.teacherName = teacherName;
        this.numOfStudent = numOfStudent;
        this.next = null;
    }
}
