package DataStructure.array;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arr = {0,2,1,0,0,2,0};
        sortArray(arr);

    }


    public static void sortArray(int[] arr){
        int tailIndex = arr.length-1;
        int faceIndex = 0;
        for(int i=0;i <= tailIndex;i++){
            System.out.println("Iteration "+i+" :"+ Arrays.toString(arr));
            if(arr[i] == 2){
                int temp;
                if(arr[tailIndex] == 2){
                    tailIndex --;
                    i--;
                }else {
                    temp = arr[tailIndex];
                    arr[tailIndex] = arr[i];
                    arr[i] = temp;
                    tailIndex--;
                }
            }else if(arr[i] == 0){
                if(faceIndex != i){
                    if(arr[faceIndex] == 0){
                        faceIndex ++;
                        if(faceIndex != i){
                            i--;
                        }

                    }else{
                        int temp = arr[faceIndex];
                        arr[faceIndex] =  arr[i] ;
                        arr[i] = temp;
                        faceIndex++;
                    }
                }
            }
        }

        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
