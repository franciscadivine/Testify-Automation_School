package Tasks;

public class Task17Adev2 extends Task17ALogin {
    public static void main(String[] args) {
        Task17Adev2 moreinfo = new Task17Adev2();
        moreinfo.continueToHomepage();
        moreinfo.Oaut();
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
