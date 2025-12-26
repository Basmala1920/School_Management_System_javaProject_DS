






import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        // ====== Students + Courses + Grades ======
//        Student s1 = new Student("emo", "emo@gmail.com", "Damanhour", "ElBehiera", 3.5, 2, "2406005", "SIM", 18);
//        s1.addCourse("Math"); s1.addCourse("Physics"); s1.addCourse("Programming");
//        s1.addGrade("Math", 85); s1.addGrade("Physics", 90); s1.addGrade("Programming", 95);

//        Student s2 = new Student("Fatom", "Fatom@gmail.com", "ELSadat", "Monofiia", 3.75, 2, "2406203", "SIM", 19);
//        s2.addCourse("History"); s2.addCourse("Science"); s2.addCourse("OOP");
//        s2.addGrade("History", 85); s2.addGrade("Science", 90); s2.addGrade("OOP", 95);
//
//        Student s3 = new Student("Basbosa", "Basbosa@gmail.com", "Alex", "Alexandria", 3.57, 2, "2406234", "SIM", 20);
//        s3.addCourse("Arabic"); s3.addCourse("Probability"); s3.addCourse("UI");
//        s3.addGrade("Arabic", 85); s3.addGrade("Probability", 90); s3.addGrade("UI", 95);

        HashMap<String, Student> students = new HashMap<>();
//        students.put(s1.getId(), s1);
//        students.put(s2.getId(), s2);
//        students.put(s3.getId(), s3);

        // ===== Launch StudentDashboards (Swing) =====
//        SwingUtilities.invokeLater(() -> {
//                    Admin admin = new Admin(); // واحد Admin لكل الـ Students
//
////                    for (Student s : students.values()) {
////                        new StudentDashboard(s, admin);
////                        // ال GUI مربوط بالـ Admin
////                    }



                    // ===== Courses example (console only) =====
                    Course course = new Course();
                    course.addCourse("Math", "1254", "Mrs Sara", 40);
                    course.addCourse("Arabic", "4445", "Mr Ahmed", 50);
                    course.addCourse("English", "4475", "Mr Mohamed", 60);
                    System.out.println("\nThe Courses:");
                    course.printCourses();
                    course.addStudentToCourse("4445");
                    course.removeStudentFromCourse("4475");
                    System.out.println("Courses after updates:");
                    course.printCourses();

                    // ===== Admin example (console only) =====
                    Admin adminConsole = new Admin();
                    adminConsole.addStudent("Ali", "2406118");
                    adminConsole.addStudent("Ahmed", "2406115");
                    adminConsole.addStudent("Mohamed", "2406119");

                    System.out.println("\nStudent List:");
                    adminConsole.printStudents();
                    adminConsole.deleteStudent("2406115");
                    System.out.println("Student list after delete:");
                    adminConsole.printStudents();

                    adminConsole.addTeacher("Mr Ahmed", "112", "1254");
                    adminConsole.addTeacher("Mrs Sara", "114", "4445");

                    System.out.println("\nTeacher List:");
                    adminConsole.printTeachers();
                    adminConsole.deleteTeacher("114");
                    System.out.println("Teacher list after delete:");
                    adminConsole.printTeachers();

                    adminConsole.addExam("Web", "54887", "12-10-2025", "A0-S1", "10:00-11:00");
                    System.out.println("\nExam Schedule:");
                    adminConsole.printExams();

                    // Attendance
                    Attendance attendance = new Attendance(adminConsole);
                    attendance.markAttendance("2406005");
                    attendance.markAttendance("2406203");
                    attendance.markAttendance("2406234");

                    System.out.println("\nAttendance List:");
                    attendance.viewAttendance();


                    // Create some Student objects
                    Student st1 = new Student("Ali", "ali@email.com", "123 Street", "Cairo", 3.8, 2, "S001", "CS", 20);
                    Student st2 = new Student("Mona", "mona@email.com", "456 Street", "Cairo", 3.5, 3, "S002", "IT", 21);
                    Student st3 = new Student("Sara", "sara@email.com", "789 Street", "Giza", 3.9, 2, "S003", "CS", 22);

                    // Add courses to students
                    st1.addCourse("Data Structures");
                    st1.addCourse("Algorithms");

                    st2.addCourse("Data Structures");
                    st2.addCourse("Databases");

                    st3.addCourse("Algorithms");
                    st3.addCourse("Databases");

                    // Add grades for courses
                    st1.addGrade("Data Structures", 95);
                    st1.addGrade("Algorithms", 88);

                    st2.addGrade("Data Structures", 90);
                    st2.addGrade("Databases", 85);

                    st3.addGrade("Algorithms", 92);
                    st3.addGrade("Databases", 89);

                    // Display students' profiles
                    System.out.println("Student Profiles:");
                    st1.viewProfile();
                    st2.viewProfile();
                    st3.viewProfile();

                    // Display courses and grades
                    System.out.println("Courses & Grades:");
                    st1.viewCourses();
                    st1.viewGrades();

                    st2.viewCourses();
                    st2.viewGrades();

                    st3.viewCourses();
                    st3.viewGrades();





//        Notifications



                    SchoolSystem system = new SchoolSystem();

                    system.sendNotification("New Exam Added", "Exam", "student");
                    system.sendNotification("Math Grade Updated", "Grade", "student");
                    system.sendNotification("New Student Enrolled", "Enrollment", "admin");
                    system.sendNotification("Class Cancelled", "Attendance", "teacher");
                    system.sendNotification("New Teacher Added", "Enrollment", "admin");
                    system.sendNotification("New Course Added", "Enrollment", "admin");

//                    Notifications GUI
//
//                    SwingUtilities.invokeLater(() -> {
//                        new NotificationGUI(system, "student").setVisible(true);
//                        new NotificationGUI(system, "admin").setVisible(true);
//                        new NotificationGUI(system, "teacher").setVisible(true);
//                    });

                    // ====== Students + Courses + Grades ======
//        Student stu1 = new Student("emo", "emo@gmail.com", "Damanhour", "ElBehiera", 3.5, 2, "2406005", "SIM", 18);
//        stu1.addCourse("Math");
//        stu1.addCourse("Physics");
//        stu1.addCourse("Programming");
//        stu1.addGrade("Math", 85);
//        stu1.addGrade("Physics", 90);
//        stu1.addGrade("Programming", 95);
//
//        Student stu2 = new Student("Fatom", "Fatom@gmail.com", "ELSadat", "Monofiia", 3.75, 2, "2406203", "SIM", 19);
//        stu2.addCourse("History");
//        stu2.addCourse("Science");
//        stu2.addCourse("OOP");
//        stu2.addGrade("History", 85);
//        stu2.addGrade("Science", 90);
//        stu2.addGrade("OOP", 95);
//
//        Student stu3 = new Student("Basbosa", "Basbosa@gmail.com", "Alex", "Alexandria", 3.57, 2, "2406234", "SIM", 20);
//        stu3.addCourse("Arabic");
//        stu3.addCourse("Probability");
//        stu3.addCourse("UI");
//        stu3.addGrade("Arabic", 85);
//        stu3.addGrade("Probability", 90);
//        stu3.addGrade("UI", 95);
//
//        HashMap<String, Student> Students = new HashMap<>();
//        Students.put(s1.getId(), stu1);
//        Students.put(s2.getId(), stu2);
//        students.put(s3.getId(), stu3);


                    // ===== Launch StudentDashboards =====
//        SwingUtilities.invokeLater(() -> {
//            Admin admin = new Admin();
//
//            for (Student s : students.values()) {
//                new StudentDashboard(s, admin);
//                // ال GUI مربوط بالـ Admin
//            }
                }
//        );

        // ===== Courses example (console only) =====
//        Course course = new Course();
//        course.addCourse("Math", "1254", "Mrs Sara", 40);
//        course.addCourse("Arabic", "4445", "Mr Ahmed", 50);
//        course.addCourse("English", "4475", "Mr Mohamed", 60);
//        System.out.println("\nThe Courses:");
//        course.printCourses();
//        course.addStudentToCourse("4445");
//        course.removeStudentFromCourse("4475");
//        System.out.println("Courses after updates:");
//        course.printCourses();

        // ===== Admin example (console only) =====
//        Admin adminConsole = new Admin();
//        adminConsole.addStudent("Ali", "2406118");
//        adminConsole.addStudent("Ahmed", "2406115");
//        adminConsole.addStudent("Mohamed", "2406119");
//
//        System.out.println("\nStudent List:");
//        adminConsole.printStudents();
//        adminConsole.deleteStudent("2406115");
//        System.out.println("Student list after delete:");
//        adminConsole.printStudents();
//
//        adminConsole.addTeacher("Mr Ahmed", "112", "1254");
//        adminConsole.addTeacher("Mrs Sara", "114", "4445");
//
//        System.out.println("\nTeacher List:");
//        adminConsole.printTeachers();
//        adminConsole.deleteTeacher("114");
//        System.out.println("Teacher list after delete:");
//        adminConsole.printTeachers();
//
//        adminConsole.addExam("Web", "54887", "12-10-2025", "A0-S1", "10:00-11:00");
//        System.out.println("\nExam Schedule:");
//        adminConsole.printExams();


        // Attendance
//        Attendance attendance = new Attendance(adminConsole);
//
//        attendance.markAttendance("2406005");
//        attendance.markAttendance("2406203");
//        attendance.markAttendance("2406234");
//
//        System.out.println("\nAttendance List:");
//        attendance.viewAttendance();
//
//        // Teacher
        Teacher teacher = new Teacher(
                "Mr Ahmed",
                "ahmed@gmail.com",
                "Alex",
                "Alexandria",
                "T01",
                "Programming");

//        teacher.registerAttendance(attendance, "2406005");
//        teacher.registerAttendance(attendance, "2406203");
//
//        System.out.println("\nAttendance by Teacher:");
//        teacher.viewAttendance(attendance);



        HashMap<String, Student> Student = new HashMap<>();
//        Student.put(s1.getId(), s1);
//        Student.put(s2.getId(), s2);
//        Student.put(s3.getId(), s3);

        // ===== Launch GUIs (Swing) =====
//        SwingUtilities.invokeLater(() -> {
//
//            // Admin instance
//            Admin admin = new Admin();
////            admin.addStudent(s1.getName(), s1.getId());
////            admin.addStudent(s2.getName(), s2.getId());
////            admin.addStudent(s3.getName(), s3.getId());
//
//            // Attendance instance
//            Attendance atte = new Attendance(admin);
//
//            // تسجيل حضور
////            atte.markAttendance(s1.getId());
////            atte.markAttendance(s2.getId());
////            atte.markAttendance(s3.getId());
//
//            System.out.println("\nAttendance List:");
//            atte.viewAttendance();
//
//            // Launch StudentDashboards
////            for (Student s : Student.values()) {
////                new StudentDashboard(s, admin).setVisible(true);
////            }
//
//            // Launch Teacher GUI example
//
//        });
    }


