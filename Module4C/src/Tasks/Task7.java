package Tasks;

public class Task7 {
    public static void main(String[] args) {
        //Two dimensional array
                String[][] fruits = new String[4][3];

                fruits[0][0] = "Apple";
                fruits[1][0] = "Banana";
                fruits[2][0] = "Orange";
                fruits[3][0] = "Mango";

                // Print the 2D array
                for (int i = 0; i < fruits.length; i++) {
                    for (int j = 0; j < fruits[i].length; j++) {
                        System.out.print(fruits[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }


