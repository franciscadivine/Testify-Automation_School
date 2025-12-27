package Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Task10 task = new Task10();
        task.visitor();


    }
    public void visitor(){
        Scanner input = new Scanner(System.in);
        String userInput = "";
        while (true){
            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("testify")){


                System.out.println("Welcome onboard");
                break;
            }
            else if (!userInput.equalsIgnoreCase("testify")){
                System.out.println("Sorry you are not a member of testify training, kindly sign up");
                break;
            }
        }

    }
}
