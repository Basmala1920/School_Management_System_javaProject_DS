public class Course {

    CourseNode courseHead;

    public void addCourse(String courseName, String courseId, String teacherName, int numOfStudent) {
        CourseNode newCourse = new CourseNode(courseName, courseId, teacherName, numOfStudent);

        if (courseHead == null) {
            courseHead = newCourse;
            return;
        }

        CourseNode current = courseHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newCourse;
    }

    public void printCourses() {
        CourseNode current = courseHead;
        while (current != null) {
            System.out.println("Course: " + current.courseName +
                    " | ID: " + current.courseId +
                    " | Teacher: " + current.teacherName +
                    " | Students: " + current.numOfStudent);
            current = current.next;
        }
    }

    public void addStudentToCourse(String courseId) {
        CourseNode current = courseHead;
        while (current != null) {
            if (current.courseId.equalsIgnoreCase(courseId)) {
                current.numOfStudent++;
                System.out.println("Student added");
                return;
            }
            current = current.next;
        }
        System.out.println("Course not found");
    }

    public void removeStudentFromCourse(String courseId) {
        CourseNode current = courseHead;
        while (current != null) {
            if (current.courseId.equalsIgnoreCase(courseId)) {
                if (current.numOfStudent > 0) {
                    current.numOfStudent--;
                    System.out.println("Student removed");
                } else {
                    System.out.println("No students");
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Course not found");
    }
}

