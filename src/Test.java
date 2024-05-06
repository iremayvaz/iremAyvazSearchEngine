public class Test {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
//        LinkedList<String> deneme = new LinkedList<>();
//
//        deneme.addFirst("file", 2);
//        deneme.addFirst("file2", 3);
//        deneme.print();
//        System.out.println();
//        deneme.findFile("file");

//        tree.insert("apple");
//        tree.insert("account");
//        tree.insert("ambitious");

        tree.insert("first", "A");
        tree.insert("wide", "A");
        tree.insert("flanged", "A");
        tree.insert("beam", "A");
        tree.insert("convective", "A");
        tree.insert("heat", "A");
        tree.insert("transfer", "A");
        tree.insert("into", "B");
        tree.insert("outer", "B");
        tree.insert("faces", "B");
        tree.insert("flanges", "A");
        tree.insert("second", "B");
        tree.insert("case", "B");
        tree.insert("considered", "A");
        tree.insert("convective", "A");
        tree.insert("heat", "B");
        tree.insert("transfer", "B");
        tree.insert("into", "B");
        tree.insert("one", "A");
        tree.insert("side", "A");
        tree.insert("flat", "B");
        tree.insert("plate", "B");


//        tree.insert(5);
//        tree.insert(3);
//        tree.insert(7);
//        tree.insert(2);
//        tree.insert(4);
//        tree.insert(6);
//        tree.insert(8);
//        tree.insert(1);

        tree.inorder();
//        tree.postorder();
//        tree.preorder();
        tree.seeCounts();

        tree.printWordsCount("case");

    }
}
