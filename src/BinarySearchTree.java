public class BinarySearchTree<T extends Comparable<T>, U> {
    BSTNode<T, U> root;

    //veri ekleme
    public void insert(T data, U fileName) {
        //eklenecek veri
        BSTNode<T, U> newNode = new BSTNode<>(data, fileName);

        if (root == null) {// root boşsa
            root = newNode;
            root.wordList.addFirst((T) fileName, root.wordCounter);
        } else {// root doluysa
            BSTNode<T, U> temp = root;// roottan childlara gezinmek için
            //root boş değilse
            while (temp != null) {

                if (newNode.data.compareTo(temp.data) < 0) {// newNode, roottan küçük
                    if (temp.left == null) {// rootun solu boş
                        temp.left = newNode;// rootun soluna eklenmeli çünkü roottan küçük
                        temp.wordList.addFirst((T) fileName, temp.wordCounter);
                        break;// döngüden çıkılmalı
                    }
                    temp = temp.left;// tempin solu doluysa solun soluna bakmak üzere tempi tempin solu olarak güncellenir.
                } else if (newNode.data.compareTo(temp.data) > 0) {// newNode, roottan büyük
                    if (temp.right == null) {// rootun sağı boş
                        temp.right = newNode;
                        temp.wordList.addFirst((T) fileName, temp.wordCounter);
                        break;
                    }
                    temp = temp.right;
                } else {// newNode.data.compareTo(temp.data) == 0, eleman BST'de var
//                    temp.wordList.findFile(temp.fileName);
                    temp.wordCounter++;// aynı kelimeden kaç tane olduğunu tutabilmek için
                    break;// bu yüzden eklenmesine gerek yok döngüden çıkış
                }

            }
        }
    }

    //veri çıktısı inorder (LNR)
    public void inorder() {
        System.out.println("inorder: ");
        inorder(root);
        System.out.println();
    }

    public void inorder(BSTNode<T, U> node) {// bir node alınır
        LinkedList<T, U> bstTree = new LinkedList<>();
        if (node != null) {// node boş değilse
            inorder(node.left);// önce sol ağaca bakılır
            System.out.print(node.data + " ");// sonra kendi
            inorder(node.right);// sonra sağ ağaca bakılır
        }
    }

    //veri çıktısı postorder (LRN)
    public void postorder() {
        System.out.println("postorder: ");
        postorder(root);
        System.out.println();
    }

    public void postorder(BSTNode<T, U> node) {
        if (node != null) {
            postorder(node.left);//alınan node un önce sol ağacına
            postorder(node.right);// sonra sağ ağacına
            System.out.print(node.data + " ");// en son da kendisi
        }
    }

    //veri çıktısı preorder (NLR)
    public void preorder() {
        System.out.println("preorder: ");
        preorder(root);
        System.out.println();
    }

    public void preorder(BSTNode<T, U> node) {
        if (node != null) {
            System.out.print(node.data + " ");// önce kendi
            preorder(node.left);// sonra sol ağacı
            preorder(node.right);// en son sağ ağacı
        }
    }

    // hangi kelimeden kaç tane var? for preorder to see if i did it right.
    public void seeCounts() {
        System.out.println("counts: ");
        seeCounts(root);
        System.out.println();
    }

    public void seeCounts(BSTNode<T, U> data) {
        if (data != null) {
            System.out.print(data.wordCounter + " ");
            seeCounts(data.left);
            seeCounts(data.right);
        }
    }

    // BST'de aranan kelimenin sahip olduğu linkedList'e erişme
    public void printWordsCount(T wanted) {
        BSTNode<T, U> temp = root;
        while (temp != null) {
            if (temp.data.equals(wanted)) {
                temp.wordList.print();
                break;
            } else if (temp.data.compareTo(wanted) > 0 && temp.left != null) {
                if (temp.left.data.equals(wanted)) {
                    temp.left.wordList.print();
                    break;
                }
                temp = temp.left;
            } else if (temp.data.compareTo(wanted) < 0 && temp.right != null) {
                if (temp.right.data.equals(wanted)) {
                    temp.right.wordList.print();
                    break;
                }
                temp = temp.right;
            } else {
                System.out.println("Data has not found");
                break;
            }
        }
//        if (root != null) {
//            BSTNode<T> temp = root;
//
//            while (temp != null) {
//                if (temp.data.compareTo(wanted) < 0) {// root'un solunda mı
//                    if (temp.left.data.equals(wanted)) {// root'un solundakine mi eşit
//                        temp.left.wordList.print();// eşitse linkedList'ine eriş
//                        break;
//                    }
//                    temp = temp.left;// eşit değilse BST'de gezinme
//                } else if (temp.data.compareTo(wanted) > 0) {// root'un sağında mı
//                    if (temp.right.data.equals(wanted)) {// sağındakine mi eşit
//                        temp.right.wordList.print();// linkedList'ini gör
//                        break;
//                    }
//                    temp = temp.right;// gezinme
//                } else {
//                    if (temp.data.equals(wanted)) {// root'a eşitse
//                        temp.wordList.print();// root'un listesi
//                        break;
//                    }
//                }
//            }
//        }
    }

    public void addWordList() {

    }
}
