
public class Admin extends Person {

    StudentNode studentHead;
    TeacherNode teacherHead;
    ExamNode examHead;

    // Constructor
    public Admin() {
        studentHead = null;
        teacherHead = null;
        examHead = null;
    }

    // ================= STUDENT =================
    public void addStudent(String name, String id) {
        StudentNode newStudent = new StudentNode(name, id);

        if (studentHead == null) { // Queue empty?
            studentHead = newStudent;
            return;
        }

        StudentNode current = studentHead; // Queue not empty
        while (current.next != null) { // Find last student
            current = current.next;
        }
        current.next = newStudent;
    }

    public void deleteStudent(String id) {
        if (studentHead == null) { // Queue empty
            System.out.println("No students");
            return;
        }

        if (studentHead.studentId.equalsIgnoreCase(id)) { // First student in queue
            studentHead = studentHead.next;
            System.out.println("Student deleted");
            return;
        }

        StudentNode current = studentHead; // Other students
        while (current.next != null) {
            if (current.next.studentId.equalsIgnoreCase(id)) {
                current.next = current.next.next;
                System.out.println("Student deleted");
                return;
            }
            current = current.next;
        }

        System.out.println("Student not found");
    }

    public void printStudents() {
        if (studentHead == null) {
            System.out.println("No students available");
            return;
        }

        StudentNode current = studentHead;
        while (current != null) {
            System.out.println("Name: " + current.studentName +
                    " | ID: " + current.studentId);
            current = current.next;
        }
    }

    // ================= TEACHER =================
    public void addTeacher(String name, String id, String courseId) {
        TeacherNode newTeacher = new TeacherNode(name, id, courseId);

        if (teacherHead == null) {
            teacherHead = newTeacher;
            return;
        }

        TeacherNode current = teacherHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newTeacher;
    }

    public void deleteTeacher(String id) {
        if (teacherHead == null) {
            System.out.println("No teachers");
            return;
        }

        if (teacherHead.teacherId.equalsIgnoreCase(id)) {
            teacherHead = teacherHead.next;
            System.out.println("Teacher deleted");
            return;
        }

        TeacherNode current = teacherHead;
        while (current.next != null) {
            if (current.next.teacherId.equalsIgnoreCase(id)) {
                current.next = current.next.next;
                System.out.println("Teacher deleted");
                return;
            }
            current = current.next;
        }

        System.out.println("Teacher not found");
    }

    public void printTeachers() {
        if (teacherHead == null) {
            System.out.println("No teachers available");
            return;
        }

        TeacherNode current = teacherHead;
        while (current != null) {
            System.out.println("Name: " + current.teacherName +
                    " | ID: " + current.teacherId +
                    " | CourseID: " + current.courseId);
            current = current.next;
        }
    }

    // ================= EXAM =================
    public void addExam(String courseName, String courseId,
                        String date, String room, String time) {

        ExamNode newExam = new ExamNode(courseName, courseId, date, room, time);

        if (examHead == null) {
            examHead = newExam;
            return;
        }

        ExamNode current = examHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newExam;
    }

    public void printExams() {
        if (examHead == null) {
            System.out.println("No exams scheduled");
            return;
        }

        ExamNode current = examHead;
        while (current != null) {
            System.out.println("Course: " + current.courseName +
                    " | ID: " + current.courseId +
                    " | Date: " + current.date +
                    " | Room: " + current.room +
                    " | Time: " + current.time);
            current = current.next;
        }
    }
}
