package Tasks;

public class Task14B {
    public static void main(String[] args) {
        Task14 areaOfSquare = new Task14();
        areaOfSquare.setLength(4);
        areaOfSquare.setBreadth(4);
        System.out.println(areaOfSquare.getSquare());
        double Area = areaOfSquare.getLength() * areaOfSquare.getBreadth();
        System.out.println("The area of a square of length "
                + areaOfSquare.getLength()
                + " and breadth "
                + areaOfSquare.getBreadth()
                + " is "
                + Area);



    }
}
