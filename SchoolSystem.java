
public class SchoolSystem {
    private int counter = 0;

    Node<Notifications> adminHead, adminTail;
    Node<Notifications> studentHead, studentTail;
    Node<Notifications> teacherHead, teacherTail;

    Node<Notifications> adminHistory;
    Node<Notifications> studentHistory;
    Node<Notifications> teacherHistory;

    public SchoolSystem() {
        adminHead = adminTail = null;
        studentHead = studentTail = null;
        teacherHead = teacherTail = null;
        adminHistory = studentHistory = teacherHistory = null;
    }

    private void enqueue(String role, Notifications n) {
        Node<Notifications> newNode = new Node<>(n);

        switch (role.toLowerCase()) {

            case "admin":
                if (adminHead == null) { // Queue فاضية
                    adminHead = adminTail = newNode;
                } else { // Queue مش فاضية
                    adminTail.next = newNode;
                    adminTail = newNode;
                }
                break;

            case "student":
                if (studentHead == null) {
                    studentHead = studentTail = newNode;
                } else {
                    studentTail.next = newNode;
                    studentTail = newNode;
                }
                break;

            case "teacher":
                if (teacherHead == null) {
                    teacherHead = teacherTail = newNode;
                } else {
                    teacherTail.next = newNode;
                    teacherTail = newNode;
                }
                break;
        }
    }

    public void sendNotification(String message, String type, String role) {
        Notifications n = new Notifications(counter++, message, type);
        enqueue(role, n);
        System.out.println("Sent to " + role + ": " + n);
    }

    // Read nxt notification from queue
    public Notifications readNext(String role) {
        Node<Notifications> head;

        switch (role.toLowerCase()) {
            case "admin":
                head = adminHead;
                break;
            case "student":
                head = studentHead;
                break;
            case "teacher":
                head = teacherHead;
                break;
            default:
                return null;
        }

        if (head == null)     // Queue is empty ?
            return null;       // there is nothing to read

        Notifications n = head.data;      // Notification to be returned
        n.markAsRead();

        switch (role.toLowerCase()) {       // Remove notification from queue & add it to history (stack)
            case "admin":
                adminHead = adminHead.next;
                if (adminHead == null)
                    adminTail = null; // Queue empty
                adminHistory = pushToHistory(adminHistory, n);
                break;

            case "student":
                studentHead = studentHead.next;
                if (studentHead == null)
                    studentTail = null;
                studentHistory = pushToHistory(studentHistory, n);
                break;

            case "teacher":
                teacherHead = teacherHead.next;
                if (teacherHead == null)
                    teacherTail = null;
                teacherHistory = pushToHistory(teacherHistory, n);
                break;
        }
        System.out.println("Read from " + role + ": " + n);
        return n;
    }

    // Stack
    private Node<Notifications> pushToHistory(Node<Notifications> top, Notifications n) {    // Add notification to history
        if (top == null) return new Node<>(n);
        Node<Notifications> newNode = new Node<>(n);
        newNode.next = top;
        return newNode;
    }


    public Node<Notifications> getQueue(String role) {     // Get head
        switch (role.toLowerCase()) {
            case "admin":
                return adminHead;
            case "student":
                return studentHead;
            case "teacher":
                return teacherHead;
            default:
                return null;
        }
    }

    public Notifications getLastRead(String role) { // Get top "Peek"
        switch (role.toLowerCase()) {
            case "admin":
                return adminHistory != null ? adminHistory.data : null; // if null return null if not return data
            case "student":
                return studentHistory != null ? studentHistory.data : null;
            case "teacher":
                return teacherHistory != null ? teacherHistory.data : null;
            default:
                return null;
        }
    }

    public void clearHistory(String role) {
        switch (role.toLowerCase()) {
            case "admin":
                adminHistory = null;
                break;
            case "student":
                studentHistory = null;
                break;
            case "teacher":
                teacherHistory = null;
                break;
        }
    }
}
