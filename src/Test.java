public class Test {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        LinkedList<String> deneme = new LinkedList<>();

        deneme.addFirst("file", 2);
        deneme.addFirst("file2", 3);
        deneme.print();
        System.out.println();
        deneme.findFile("file");

//        tree.insert("apple");
//        tree.insert("account");
//        tree.insert("ambitious");

//        tree.insert("first");
//        tree.insert("case");
//        tree.insert("wide");
//        tree.insert("flanged");
//        tree.insert("beam");
//        tree.insert("convective");
//        tree.insert("heat");
//        tree.insert("transfer");
//        tree.insert("into");
//        tree.insert("outer");
//        tree.insert("faces");
//        tree.insert("flanges");
//        tree.insert("second");
//        tree.insert("case");
//        tree.insert("considered");
//        tree.insert("convective");
//        tree.insert("heat");
//        tree.insert("transfer");
//        tree.insert("into");
//        tree.insert("one");
//        tree.insert("side");
//        tree.insert("flat");
//        tree.insert("plate");

//        tree.insert(5);
//        tree.insert(3);
//        tree.insert(7);
//        tree.insert(2);
//        tree.insert(4);
//        tree.insert(6);
//        tree.insert(8);
//        tree.insert(1);

//        tree.inorder();
//        tree.postorder();
//        tree.preorder();
//        tree.seeCounts();
    }
}
