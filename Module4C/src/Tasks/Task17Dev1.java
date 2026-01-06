package Tasks;

public class Task17Dev1 extends Task17ALogin implements Task17ADev1 {
    public static void main(String[] args) {

    Task17Dev1 moreinfo = new Task17Dev1();
    moreinfo.userName();
    moreinfo.userPassword();
    moreinfo.signIn();
}
@Override
public void userName() {
    System.out.println("Enter your username");

}

@Override
public void userPassword() {
    System.out.println("Enter password");

}

@Override
public void forgotPassword() {
    System.out.println("Reset password");

}

@Override
public void signIn() {
    System.out.println("click here to sign");

}
}

