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

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int rightSubTreeHeight = height(root.left);
        int leftSubTreeHeight = height(root.right);

        if (rightSubTreeHeight > leftSubTreeHeight) {
            return rightSubTreeHeight + 1;
        } else if (rightSubTreeHeight < leftSubTreeHeight) {
            return leftSubTreeHeight + 1;
        } else {
            return leftSubTreeHeight + 1;
        }
    }

    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    static class TreeInfo {
        int diam;
        int height;

        TreeInfo(int diam, int height) {
            this.diam = diam;
            this.height = height;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height + right.height + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        return new TreeInfo(myDiam, myHeight);
    }

    public Node buildBinarySearchTree(Node root, int val) {
        if (root == null) {
            Node newNode = new Node(val);
            return newNode;
        } else if (root.data == val) {
            return root;
        } else if (root.data > val) {
            return buildBinarySearchTree(root.left, val);
        } else {
            return buildBinarySearchTree(root.right, val);
        }
    }

    public boolean isKeyExistInBst(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return isKeyExistInBst(root.left, key);
        } else {
            return isKeyExistInBst(root.right, key);
        }
    }

    public Node deleteKeyFromBST(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (root.data == key) {
            if (root.right == null && root.left == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node currentNode = root.right;
                while (currentNode.left != null) {
                    currentNode = currentNode.left;
                }
                root.data = currentNode.data;
                root.right = deleteKeyFromBST(root.right, currentNode.data);
                return root;
            }
        }

        if (root.data > key) {
            root.left = deleteKeyFromBST(root.left, key);
        }

        else if (root.data < key) {
            root.right = deleteKeyFromBST(root.right, key);
        }
        return root;
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
