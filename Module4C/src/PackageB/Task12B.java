package PackageB;

import PackageA.Task12A;

public class Task12B {
    public static void main(String[] args) {
       Task12B access = new Task12B();
       access.accessB();

        Task12A variable = new Task12A();
        variable.accessA();
    }
    private void accessB (){
        System.out.println("latest access");
    }
}
