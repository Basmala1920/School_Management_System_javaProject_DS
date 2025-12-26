public class ExamNode {
    String courseName;
    String courseId;
    String date;
    String room;
    String time;
    ExamNode next;

    public ExamNode(String courseName, String courseId, String date, String room, String time) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.date = date;
        this.room = room;
        this.time = time;
        this.next = null;
    }
}

