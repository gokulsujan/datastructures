public class BinaryTree {
    Node root;

    static int buildTreeIdx = -1;

    public Node buildTreePreOrder(int nodes[]) {
        buildTreeIdx++;
        if (nodes[buildTreeIdx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[buildTreeIdx]);
        newNode.left = buildTreePreOrder(nodes);
        newNode.right = buildTreePreOrder(nodes);
        return newNode;
    }

    public void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
