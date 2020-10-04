package problemSolving;

public class BinaryTreeSample {

    Node root;

    BinaryTreeSample() {
        root = null;
    }

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    private Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertNode(root.left, key);
        } else if (key > root.key) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }


    public static void main(String[] args) {

        BinaryTreeSample binaryTreeSample = new BinaryTreeSample();
        binaryTreeSample.insert(50);
        binaryTreeSample.insert(20);
        binaryTreeSample.insert(40);
        binaryTreeSample.insert(60);
        binaryTreeSample.insert(80);
        binaryTreeSample.insert(70);
        binaryTreeSample.insert(30);
        binaryTreeSample.inorder();
    }


}
