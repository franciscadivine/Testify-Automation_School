package Tasks;

public class Task9A {
    public static void main(String[] args) {
        //Loop through a list 0f numbers from 1-10
        for(int i = 1; i <= 10; i++){
            if(i %2 == 0){
                System.out.println(i + " is even number");
            }
            else {
                System.out.println(i + " is odd number");
            }
        }
    }
}
