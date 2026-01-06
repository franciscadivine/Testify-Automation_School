package Tasks;

public class Task15Child extends Task15Parent{
    public static void main(String[] args) {

        Task15Child variable = new Task15Child();
        variable.painter();
        variable.Artist();
        variable.danceStyle();
        variable.playKeyboard();
        variable.singSong();


    }
    public void painter(){
        System.out.println("I can paint");

    }
    public void Artist(){
        System.out.println("i am a good artist");
    }

}
