public class Teacher extends Person {
    private String teacherId;
    private String subject; // المادة الي بيدرسها

    public Teacher(String name, String email, String address, String city,
                   String teacherId, String subject) {
        super(name, email, address, city);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getSubject() {
        return subject;
    }

    // تسجيل حضور الطالب باستخدام Attendance class
    public void registerAttendance(Attendance attendance, String studentId) {
        attendance.markAttendance(studentId);
    }

    // عرض الحضور باستخدام Attendance class
    public void viewAttendance(Attendance attendance) {
        attendance.viewAttendance();
    }

    // إضافة درجة للطالب باستخدام Grade class
    public void addGrade(Grade grade, Student student, double value) {
        grade.addGrade(student, value);
        System.out.println("Grade " + value + " added for student " + student.getName());
    }

    // عرض درجات الطالب لمادة معينة
    public void viewGrade(Grade grade, Student student) {
        double value = grade.getGrade(student);
        if (value != -1) {
            System.out.println(student.getName() + " -> " + value);
        } else {
            System.out.println("Student " + student.getName() + " has no grade for " + subject);
        }
    }

    // حساب المتوسط لمادة معينة
    public void calculateAverage(Grade grade) {
        System.out.println("Average for " + subject + ": " + grade.calculateAverage());
    }
}









