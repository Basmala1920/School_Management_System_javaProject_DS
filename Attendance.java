class Attendance {

    private Admin admin; // نخليها تتعامل مع الطلاب الموجودين في الـ Admin
    private StudentNode attendanceHead; // head linked list للحضور

    // Constructor
    public Attendance(Admin admin) {
        if (admin == null) {
            throw new IllegalArgumentException("Admin cannot be null");
        }
        this.admin = admin;
        this.attendanceHead = null;
    }

    // التأكد إن الطالب موجود في الـ Admin
    private boolean isStudentExists(String studentId) {            // linked list
        StudentNode current = admin.studentHead;
        while (current != null) {
            if (current.studentId.equalsIgnoreCase(studentId)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // التأكد إن الطالب موجود في الحضور
    private boolean isPresent(String studentId) {
        StudentNode current = attendanceHead;
        while (current != null) {
            if (current.studentId.equalsIgnoreCase(studentId)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // تسجيل حضور
    public void markAttendance(String studentId) {
        if (!isStudentExists(studentId)) {          // لو الطالب موجود في الـ Admin
            System.out.println("Student ID " + studentId + " غير موجود في النظام");
            return;
        }

        if (!isPresent(studentId)) {          // لو الطالب متسجلش ف الحضور قبل كدا
            StudentNode newNode = new StudentNode(null, studentId);
            if (attendanceHead == null) {
                attendanceHead = newNode;
            } else {
                StudentNode current = attendanceHead;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            System.out.println("تم تسجيل حضور الطالب: " + studentId);
        } else {
            System.out.println("الطالب: " + studentId + " مسجل حضور بالفعل");
        }
    }

    // عرض الحضور
    public void viewAttendance() {
        if (attendanceHead == null) {
            System.out.println("لا يوجد حضور مسجل حتى الآن");
            return;
        }
        System.out.println("Attendance List:");
        StudentNode current = attendanceHead;
        while (current != null) {
            System.out.println("Student ID: " + current.studentId + " حاضر");
            current = current.next;
        }
    }
}
