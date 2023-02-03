public class Main {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] twoDimensionalArray = new int[rows][columns];

        twoDimensionalArray[0][1] = 4;
        twoDimensionalArray[1][1] = 1;
        twoDimensionalArray[1][0] = 8;

        System.out.println("row, column, value");
        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int column = 0; column < twoDimensionalArray[row].length; column++) {
                int value = twoDimensionalArray[row][column];
                System.out.println("" + row + ", " + column + ", " + value);
            }
        }
    }
}
