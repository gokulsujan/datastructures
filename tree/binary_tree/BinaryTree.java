import java.util.*;

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

    public void levelorderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }

    public int totalNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return totalNodes(root.left) + totalNodes(root.right) + 1;
    }

    public int sumOfNodesData(Node root) {
        if (root == null) {
            return 0;
        }

        return sumOfNodesData(root.left) + sumOfNodesData(root.right) + root.data;
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
