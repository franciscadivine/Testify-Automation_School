package Tasks;

public class Task11B {
    public static void main(String[] args) {
        Task11 nameDetails = new Task11();
        nameDetails.name = "";
        nameDetails.personalName(nameDetails.name);
        System.out.println(nameDetails.personalName("Francisca"));
    }

}
