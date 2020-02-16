package collection.examples.array;

public class RotateArray {

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] intArray = {1,2,3,4,5,6,7};
        int[] rotatedArray = ra.rotLeft(intArray,5);
        System.out.println("");
        printArray(rotatedArray);
    }
     int[] rotLeft(int[] a, int d) {
        if(a.length<=1 || d==0){
            return a;
        }
        for(int i = 0 ; i< d ; i++){
            int temp = a[0];
            for(int j = 0 ; j< a.length ; j++){
                if(j == a.length-1){
                    a[j] = temp;
                }else{
                    a[j] = a[j+1];
                }
            }
        }
        return a;
    }

    private static void printArray(int[] intArray) {
        for (int element:
                intArray) {
            System.out.print(element+",");
        }
    }
}
