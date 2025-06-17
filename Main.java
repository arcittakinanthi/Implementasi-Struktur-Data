public class Main {
    public static void main(String[] args) {
        VirusTree tree = new VirusTree();
        
        System.out.println("Pre-order Traversal:");
        tree.preorderTraversal();
        
        System.out.println("\nApakah ini BST?");
        System.out.println(tree.checkBST());
    }
}
