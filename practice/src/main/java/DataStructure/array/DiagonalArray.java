package DataStructure.array;

public class DiagonalArray {

    public static void main(String[] args) {

        int[][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printDiagonally(arr,4,4);
        printHorizontally(arr,4,4);
    }


    private static void printDiagonally(int[][] arr, int row, int col){


        System.out.println();

    }
    private static void printHorizontally(int[][] arr, int row, int col){

        System.out.println("Printing Array Horizontally");
        System.out.println("---------------------------------");

        for (int i=0;i<row;i++){
            System.out.println();
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+", ");
            }
        }
    }
}
