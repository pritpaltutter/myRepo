package GeeksForGeeks.org.coding;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Given an array A of size N having distinct elements, the task is to find the next greater element for each element of the array in order of their appearance in the array. If no such element exists, output -1
 *
 * Input:
 * The first line of input contains a single integer T denoting the number of test cases.Then T test cases follow. Each test case consists of two lines. The first line contains an integer N denoting the size of the array. The Second line of each test case contains N space separated positive integers denoting the values/elements in the array A.
 *
 * Output:
 * For each test case, print in a new line, the next greater element for each array element separated by space in order.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 107
 * 1 <= Ai <= 1018
 * Example:
 * Input
 * 2
 * 4
 * 1 3 2 4
 * 4
 * 4 3 2 1
 * Output
 * 3 4 4 -1
 * -1 -1 -1 -1
 */
public class NextGreaterElement {
    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1,2,3,4,5);
        new NextGreaterElement().findNextLargeElements(inputList);

        System.out.println("Second Input");
         inputList = Arrays.asList(5,4,3,2,1);
        new NextGreaterElement().findNextLargeElements(inputList);
    }

    public List findNextLargeElements(List<Integer> inputList){

        Stack<Integer> tempStack = new Stack();
        List<Integer> finalList = new ArrayList<>();
            for (Integer ele: inputList) {
                if(tempStack.isEmpty()) {
                    tempStack.push(ele);
                }else{
                    if(ele <= tempStack.peek()){
                        tempStack.push(ele);
                    }else{
                        while(!tempStack.isEmpty() && ele > tempStack.peek()) {
                            Integer poppedElement = tempStack.pop();
                            System.out.println(poppedElement + "->" + ele);
                        }
                        tempStack.push(ele);
                    }
                }


        }
            while(!tempStack.isEmpty()){
                Integer poppedElement = tempStack.pop();
                System.out.println(poppedElement + "->" + "-1");
            }
        return null;
    }
}
