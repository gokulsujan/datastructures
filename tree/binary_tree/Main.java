public class Main {
    public static void main(String[] args) {
        int tree[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // Build tree in preorder
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = binaryTree.buildTreePreOrder(tree);

        // Preorder traversal
        System.out.print("Preorder traversal: ");
        binaryTree.preorderTraversal(binaryTree.root);
        System.out.println("");
    }
}
