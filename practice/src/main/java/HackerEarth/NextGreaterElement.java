package HackerEarth;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int []arr = {2,6,3,1,7,9,10};
        int []out = new int[7];


       // System.out.println(Arrays.toString(nextGreaterElementUsingArray(arr)));
       nextGreaterElementUsingStack(arr);


    }


    private static int[] nextGreaterElementUsingStack(int[] arr){
        int temp[] = new int[arr.length];
        int index=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i=1;i<arr.length;i++){
            if (!stack.isEmpty() && arr[i]>stack.peek()){
                while(!stack.isEmpty()){
                    int a = stack.pop();
                    System.out.println(a+"---->"+arr[i]);
                }
                stack.push(arr[i]);
            }else{
                stack.push(arr[i]);
            }
        }
        while(!stack.isEmpty()){
            int a = stack.pop();
            System.out.println(a+"----> -1");
        }
        return temp;
    }

    private static int[] nextGreaterElementUsingArray(int[] arr) {

        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if(j==arr.length-1){
                    arr[j] = -1;
                }
                else if(arr[j] >arr[i]){
                    arr[i]=arr[j];
                    break;
                }
            }
        }
        return arr;
    }
}
