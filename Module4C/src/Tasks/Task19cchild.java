package Tasks;

public class Task19cchild extends Task19c {
    public class ClassB extends ClassA {
        String name = "Anderson";

        public void printNames() {
            System.out.println("Class A name: " + super.name);
            System.out.println("Class B name: " + this.name);
        }
    }

}
