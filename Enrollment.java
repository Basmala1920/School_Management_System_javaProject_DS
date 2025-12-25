public class Enrollment {

    private Student student;
    private CourseNode courseHead; // linked list of courses the student is enrolled in
    private int courseCount;

    public Enrollment(Student student) {
        this.student = student;
        this.courseHead = null;
        this.courseCount = 0;
    }

    // Enroll student in a course
    public void enrollCourse(CourseNode course) {
        if (isEnrolled(course)) {
            System.out.println(student.getName() + " is already enrolled in " + course.courseName);
            return;
        }

        // Add new course at head
        course.next = courseHead;
        courseHead = course;
        courseCount++;
        System.out.println(student.getName() + " enrolled in " + course.courseName);
    }

    // Drop a course
    public void dropCourse(CourseNode course) {
        CourseNode current = courseHead;
        CourseNode prev = null;

        while (current != null) {
            if (current.courseId.equals(course.courseId)) {
                if (prev == null) {
                    courseHead = current.next;
                } else {
                    prev.next = current.next;
                }
                courseCount--;
                System.out.println(student.getName() + " dropped " + course.courseName);
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("Course not found for " + student.getName());
    }

    // Check if enrolled
    public boolean isEnrolled(CourseNode course) {
        CourseNode current = courseHead;
        while (current != null) {
            if (current.courseId.equals(course.courseId)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get enrolled courses as array
    public CourseNode[] getEnrolledCourses() {
        CourseNode[] courses = new CourseNode[courseCount];
        CourseNode current = courseHead;
        int index = 0;
        while (current != null) {
            courses[index++] = current;
            current = current.next;
        }
        return courses;
    }

    // Get number of enrolled courses
    public int getCourseCount() {
        return courseCount;
    }

    // Display all enrolled courses
    public void displayCourses() {
        CourseNode current = courseHead;
        System.out.println("Courses enrolled by " + student.getName() + ":");
        while (current != null) {
            System.out.println("- " + current.courseName + " | ID: " + current.courseId + " | Teacher: " + current.teacherName);
            current = current.next;
        }
    }
}