package DataStructure.array;

public class DiagonalArray {

    public static void main(String[] args) {

        int[][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printDiagonally(arr,4,4);
        printHorizontally(arr,4,4);
        printVertically(arr,4,4);
    }


    private static void printDiagonally(int[][] arr, int row, int col){

        int i=0,j=0,iteration = 0;

        boolean isDownward = Boolean.TRUE;
        boolean bottomRow = Boolean.FALSE;
        // Run While loop for nXm times
        //print the first element
        System.out.print(arr[i][j]);
        System.out.print(",");
        i=0;
        j=j+1;
        while( iteration<(row*col -1 )) {
            iteration++;
            //check corner elements
            if(isDownward  ){
                if((i > (row -1) && (j < 0))){
                    i = i -1;
                    j = j+2;
                    isDownward = Boolean.FALSE;
                    bottomRow = Boolean.TRUE;
                }
                else if(i > (row -1) ){
                    if(bottomRow){
                        i = i -1;
                        j = j+2;
                    }else {
                        i = i - 1;
                        j = j + 1;
                    }
                    isDownward = Boolean.FALSE;
                }else if(j < 0){
                    i = i;
                    j = j+1;
                    isDownward = Boolean.FALSE;
                }
            }else{
                if(j > (col -1) ){
                    i = i +2;
                    j = j-1;
                    isDownward = Boolean.TRUE;
                }else if(i < 0){
                    i = i+1;
                    j = j;
                    isDownward = Boolean.TRUE;
                }
            }
            //downward logic
            if(isDownward){
                System.out.print(arr[i][j]);
                System.out.print(",");
                i=i+1;
                j=j-1;

            } else{
                System.out.print(arr[i][j]);
                System.out.print(",");
                i=i-1;
                j=j+1;
            }



        }

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
    private static void printVertically(int[][] arr, int row, int col){

        System.out.println("Printing Array Vertically");
        System.out.println("---------------------------------");

    for(int i=0;i< row;i++){
        System.out.print("[");
        for(int j=0;j<col;j++){
            System.out.print(arr[j][i]);
            if(!(j ==col-1)){
                System.out.print(",");
            }

        }
        System.out.print("],");
    }

    }
}
