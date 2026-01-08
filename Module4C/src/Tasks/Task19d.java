package Tasks;

public class Task19d {



    // instance member
    String name = "Delta";

    public void printName(String name) {

        System.out.println(this.name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Task19d printer = new Task19d();
        printer.printName("Lola");
    }
}

