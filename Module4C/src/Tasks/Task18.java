package Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        //user age input
        Scanner userAge = new Scanner(System.in);
        try {
            System.out.println("Please enter your age");
            int age = userAge.nextInt();
            System.out.println("Your age is: " + age);
        }
        catch (Exception newException){
            System.out.println("Please enter a valid age");
            System.out.println(newException);
        }
        finally {
            System.out.println("System Okay");
            userAge.close();
        }


    }

}
