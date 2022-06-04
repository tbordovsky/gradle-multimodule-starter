import com.google.common.base.Preconditions;

public class Hello {
    public static void main(String[] args) {
        sayHello(Constants.SUBJECT);
    }

    public static void sayHello(String subject) {
        Preconditions.checkNotNull(subject, "The subject of the greeting is required.");
        System.out.println("Hello, " + subject + "!");
    }
}