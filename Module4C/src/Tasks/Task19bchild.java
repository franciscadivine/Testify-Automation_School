package Tasks;

public class Task19bchild {
    public static void main(String[] args) {

        // Set value at runtime
        Task19b.setEnvironment("QA Environment");

        // Access without creating an object
        System.out.println("Running tests in: " + Task19b.environment);
    }
}