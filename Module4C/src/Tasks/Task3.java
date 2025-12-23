package Tasks;

public class Task3 {
    public static void main(String[] args) {
        // to print out age
        int age = 27;
        String ageInfo = "I am " + age + " years old";
        System.out.println(ageInfo);
        //Concat option
        System.out.println("I am ".concat(String.valueOf(age)).concat(" years old"));
    }
}
