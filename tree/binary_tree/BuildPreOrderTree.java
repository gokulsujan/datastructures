public class BuildPreOrderTree {
    public static void main(String[] args) {
        int tree[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = binaryTree.buildTreePreOrder(tree);

        System.out.println(binaryTree.root.data);
        System.out.println(binaryTree.root.right.right.data);

    }
}
