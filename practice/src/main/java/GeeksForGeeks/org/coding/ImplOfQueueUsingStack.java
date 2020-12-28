package GeeksForGeeks.org.coding;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ImplOfQueueUsingStack {

    public static void main(String[] args) {
        ImplOfQueueUsingStack impl = new ImplOfQueueUsingStack();
        impl.queueImpl();
    }


    public void queueImpl() {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = null;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (Integer ele : list
        ) {
            st1.push(ele);
        }
        Iterator<Integer> it = st1.iterator();
        System.out.println("Stack1");
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }

        st2 = transformToBeLikeQueue(st1);
        System.out.println();
        System.out.println("Stack2");
        printStack(st2);

    }

    private void printStack(Stack<Integer> st1) {
        while (!st1.isEmpty()) {
            System.out.print(st1.pop()+",");
        }
    }

    public Stack transformToBeLikeQueue(Stack<Integer> st1) {
        Stack<Integer> st2 = new Stack<>();
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        return st2;
    }
}


