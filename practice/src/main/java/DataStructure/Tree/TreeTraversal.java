package DataStructure.Tree;

import java.util.Stack;

public class TreeTraversal {

private static Node rootNode;

static {

    Node three = new Node(null,3,null);
    Node six = new Node(null,6,null);
    Node five =  new Node(three,5,six);

    Node thirteen = new Node(null,13,null);
    Node sixteen = new Node(null,16,null);
    Node fifteen = new Node(thirteen,15,sixteen);

    rootNode = new Node(five,10,fifteen);



}

    public static void main(String[] args) {

        TreeTraversal treeTraversal = new TreeTraversal();
        System.out.println("PreOrder Traversal");
        treeTraversal.preOrderTraversal(rootNode);
        System.out.println();
        System.out.println("PostOrder Traversal");
        treeTraversal.postOrderTraversal(rootNode);
        System.out.println();
        System.out.println("InOrder Traversal");
        treeTraversal.inOrderTraversal(rootNode);
        System.out.println();
        System.out.println("Zigzag Traversal");
        treeTraversal.zigzagTraversal(rootNode);
        System.out.println();
        System.out.println("Level order Traversal");
        treeTraversal.levelOrderTraversal(rootNode,2);
    }

    public void preOrderTraversal(Node rootNode){

        if(rootNode != null) {
            System.out.print(rootNode.getValue() + " , ");
            preOrderTraversal(rootNode.getLeft());
            preOrderTraversal(rootNode.getRight());
        }else{
            return;
        }
    }

    public void postOrderTraversal(Node rootNode){
        if(rootNode != null) {
            postOrderTraversal(rootNode.getLeft());
            postOrderTraversal(rootNode.getRight());
            System.out.print(rootNode.getValue() + " , ");
        }else{
            return;
        }
    }

    public void inOrderTraversal(Node rootNode){
        if(rootNode != null) {
            inOrderTraversal(rootNode.getLeft());
            System.out.print(rootNode.getValue() + " , ");
            inOrderTraversal(rootNode.getRight());
        }else{
            return;
        }
    }

    public void zigzagTraversal(Node rootNode){


        Stack<Node> leftRight = new Stack<Node>();
        Stack<Node> rightLeft = new Stack<Node>();

        System.out.print(rootNode.getValue()+"-->");
        leftRight.push(rootNode);

        while (!leftRight.isEmpty()|| !rightLeft.isEmpty()){
            while(!leftRight.isEmpty()) {
                Node node = leftRight.pop();
                if(node.getRight() != null) {
                    System.out.print(node.getRight().getValue() + "-->");
                    rightLeft.push(node.getRight());
                }
                if(node.getLeft() != null) {
                    System.out.print(node.getLeft().getValue() + "-->");
                    rightLeft.push(node.getLeft());
                }
            }
            while(!rightLeft.isEmpty()){
                Node node = rightLeft.pop();
                if(node.getLeft() != null) {
                    System.out.print(node.getLeft().getValue() + "-->");
                    rightLeft.push(node.getLeft());
                }if(node.getRight() != null) {
                    System.out.print(node.getRight().getValue() + "-->");
                    rightLeft.push(node.getRight());
                }
            }
        }
    }

    public void levelOrderTraversal(Node node, int level) {

        if (level < 1) {
            System.out.print(node.getValue()+"-->");
            return;
        } else {
            levelOrderTraversal(node.getLeft(), level - 1);
            levelOrderTraversal(node.getRight(), level - 1);
        }
    }

}
