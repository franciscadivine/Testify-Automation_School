package Tasks;

public class Task16Bchild extends Task16B{
    public static void main(String[] args) {
        Task16Bchild variable = new Task16Bchild();
        variable.human("ken", 45);
        variable.school("Maria", 150);

    }
        @Override
        public void human(String name, int age){
            System.out.println("my name is Ben, ia am 28years old");
        }
        @Override
        public void school(String name, float fees){
            System.out.println("Boys high school, 1500.8");
        }

}
