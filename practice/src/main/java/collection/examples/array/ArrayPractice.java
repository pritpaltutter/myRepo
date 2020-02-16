package collection.examples.array;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] intArray = {-1,2,-3,4,5,6,-7,-8,-9};
        System.out.println("Original array");
        System.out.println("----------------------------");

        printArray(intArray);

        System.out.println();
        System.out.println("----------------------------");


        int ptr = intArray.length-1;
        for (int i=0;i<intArray.length;i++){
            if(i == ptr){
                break;
            }
            if(intArray[i]<0){
                if(intArray[ptr]<0){
                    --ptr;
                    --i;
                }else {
                    int temp = intArray[ptr];
                    intArray[ptr] = intArray[i];
                    intArray[i] = temp;
                    --ptr;
                }
            }else if(intArray[ptr]<0){
                --ptr;
            }

        }
        System.out.println();
        System.out.println("Arranged array");
        System.out.println();
        System.out.println("----------------------------");

        printArray(intArray);
        System.out.println();
        System.out.println("----------------------------");
    }

    private static void printArray(int[] intArray) {
        for (int element:
        intArray) {
            System.out.print(element+",");
        }
    }
}
