
import java.time.LocalDateTime;

public class Notifications {
    private int id;
    private String message;
    private String date;
    private Type type; // "Grade", "Attendance", "Enrollment"
    private boolean isRead;

    public Notifications(int id, String message, String type) {
        this.id = id;
        this.message = message;
        this.type = Type.valueOf(type.toUpperCase());
        this.date = LocalDateTime.now().toString();
        this.isRead = false;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }


    public Type getType() {
        return type;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message + (isRead ? " (Read)" : " (Unread)");
    }

}