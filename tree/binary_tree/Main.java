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

        // Inorder traversal
        System.out.print("Inorder traversal: ");
        binaryTree.inorderTraversal(binaryTree.root);
        System.out.println("");

        // Postorder traversal
        System.out.print("Postorder traversal: ");
        binaryTree.postorderTraversal(binaryTree.root);
        System.out.println("");

        // Level order traversal
        System.out.println("Level order traversal");
        binaryTree.levelorderTraversal(binaryTree.root);

        // Count of total nodes
        System.out.println("Total number of nodes: " + binaryTree.totalNodes(binaryTree.root));

        // Sum of datas in the node
        System.out.println("Sum data of nodes: " + binaryTree.sumOfNodesData(binaryTree.root));

        // Height of the tree
        System.out.println("Height of the tree: " + binaryTree.height(binaryTree.root));

    }
}
