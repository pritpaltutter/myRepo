package collection.examples.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    private static class Node{
        int val;
        Node next;
        Node(int val,Node node){
            this.val = val;
            this.next = node;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }


    public static void main(String[] args) {

        Node pos9 = new Node(9,null);
        Node pos8 = new Node(8,pos9);
        Node pos7 = new Node(7,pos8);
        Node pos6 = new Node(6,pos7);
        Node pos5 = new Node(5,pos6);
        Node pos4 = new Node(4,pos5);
        Node pos3 = new Node(3,pos4);
        Node pos2 = new Node(2,pos3);
        Node pos1 = new Node(1,pos2);

        Node start = pos1;
        Node iterator = start;
        printLinList(iterator);


        //Reversing a list


        Node temp1 = start;
        Node temp2 = temp1.next;
        Node temp3 = temp2.next;
        temp1.next =null;
        do {
            temp2.next = temp1;
            printLinList(temp2);
            System.out.println("");
            temp1 = temp2;
            temp2 = temp3;
            temp3 = temp3.next;
        }while(temp3 != null);

        temp2.next = temp1;
        start = temp2;
        iterator = start;


        printLinList(iterator);


    }

    private static void printLinList(Node iterator) {
        while(iterator != null){
            System.out.print(iterator.val+"-->");
            iterator = iterator.next;
        }
        System.out.println("null");
    }


    private static void printLinkedList(List<Integer> st) {
        Iterator it = st.iterator();

        while (it.hasNext()){
            System.out.print(it.next()+"-->");
        }

        System.out.print("null");
    }
}
