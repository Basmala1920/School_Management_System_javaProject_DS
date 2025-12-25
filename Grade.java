
public class Grade {

    private String courseName;
    private GradeNode head; // head of student linked list
    private GradeNode lastViewed; // last viewed student

    public Grade(String courseName) {
        this.courseName = courseName;
        this.head = null;
        this.lastViewed = null;
    }

    // Add or update student grade
    public void addGrade(Student student, double grade) {
        GradeNode current = head;
        while (current != null) {
            if (current.student.getId().equals(student.getId())) {
                current.student.addGrade(courseName, (int) grade);
                lastViewed = current;
                return;
            }
            current = current.pointer;
        }
        // Add new student at head
        student.addGrade(courseName, (int) grade);
        GradeNode newNode = new GradeNode(student);
        newNode.pointer = head;
        head = newNode;
        lastViewed = newNode;
    }

    // Get grade of a student
    public double getGrade(Student student) {
        GradeNode current = head;
        while (current != null) {
            if (current.student.getId().equals(student.getId())) {
                lastViewed = current;
                return current.student.getGrades().get(courseName);
            }
            current = current.pointer;
        }
        return -1; // Not found
    }

    // Calculate average
    public double calculateAverage() {
        if (head == null) return 0.0;
        double sum = 0;
        int count = 0;
        GradeNode current = head;
        while (current != null) {
            sum += current.student.getGrades().get(courseName);
            count++;
            current = current.pointer;
        }
        return sum / count;
    }

    // Get top student
    public Student getTopStudent() {
        if (head == null) return null;
        GradeNode current = head;
        Student top = current.student;
        double max = top.getGrades().get(courseName);
        while (current != null) {
            double g = current.student.getGrades().get(courseName);
            if (g > max) {
                max = g;
                top = current.student;
            }
            current = current.pointer;
        }
        return top;
    }

    // Get total number of students
    public int getStudentCount() {
        int count = 0;
        GradeNode current = head;
        while (current != null) {
            count++;
            current = current.pointer;
        }
        return count;
    }

    // Undo last viewed student
    public Student undoLastViewed() {
        Student temp = lastViewed == null ? null : lastViewed.student;
        lastViewed = null;
        return temp;
    }

    // Display all students and grades
    public void displayAllGrades() {
        GradeNode current = head;
        while (current != null) {
            System.out.println(current.student.getName() + " -> " + current.student.getGrades().get(courseName));
            current = current.pointer;
        }
    }
}