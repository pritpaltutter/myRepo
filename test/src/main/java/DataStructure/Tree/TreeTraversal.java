package DataStructure.Tree;

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

    }



}
