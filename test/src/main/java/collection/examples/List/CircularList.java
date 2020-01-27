package collection.examples.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CircularList {

    private static class Node {
        int value;
        Node next;


        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    private static Node start;
    private static List<Node> nodeList = new ArrayList<Node>();

    public static void main(String[] args) {


        Node ten = new Node(10,null );
        Node nine = new Node(9, ten);
        Node eight = new Node(8, nine);
        Node seven = new Node(7, eight);
        Node six = new Node(6, seven);

        Node five = new Node(5, six);
        Node four = new Node(4, five);
        Node three = new Node(3, four);
        Node two = new Node(2, three);
        Node one = new Node(1, two);

        ten = new Node(10,seven );
        start = one;
        Node temp = start;
        detectLoop(temp);


    }

    private static void parseList(Node temp) {
        while (temp.getNext() != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.print("null");
    }

    private static void detectLoop(Node temp) {
        Node twoX = temp.getNext();
        while (temp != null && twoX.getNext() != null && (temp.getValue() != twoX.getValue())) {
            System.out.print(temp.getValue());
            System.out.print(", "+twoX.getValue());
            System.out.println();
            temp = temp.getNext();
            twoX = twoX.getNext().getNext();
        }
        System.out.println("Loop Over");
        if (temp == null || twoX == null) {
            System.out.println("Loop not found" );
        } else {
            System.out.println("The loop is in :" + temp.getValue());
        }
    }


}
