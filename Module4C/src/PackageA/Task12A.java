package PackageA;

import PackageB.Task12B;

public class Task12A {
    public static void main(String[] args) {
        Task12A variable = new Task12A();
        variable.accessA();
        /*Task12B access = new Task12B();
        access.accessB();*/  //It throws an error because its private
    }
        public void accessA (){
            System.out.println("new access");

    }
}
