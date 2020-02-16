package DataStructure.Tree;

public class HeightOfTree {



        private Node root;

    /* Given a binary tree. Print its nodes in level order
        using array for implementing queue */
        int size()
        {
            return size(root);
        }

        /* computes number of nodes in tree */
        int size(Node node)
        {
            if (node == null)
                return 0;
            else
                return(size(node.left) + 1 + size(node.right));
        }



        int height(){
           return height(0,root);
        }


        public int height(int height, Node node){
            if(node == null){
                return height;
            }
            else{
                int temp = height;
                ++temp;
                return(Math.max(height(temp,node.left),height(temp,node.right)));
            }
        }

        public static void main(String args[])
        {
            /* creating a binary tree and entering the nodes */
            HeightOfTree tree = new HeightOfTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            System.out.println("The size of binary tree is : "
                    + tree.size());

            System.out.println("The height of binary tree is : "
            +tree.height());
        }
    }



