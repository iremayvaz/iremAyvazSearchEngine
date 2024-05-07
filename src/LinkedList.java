public class LinkedList<T extends Comparable<T>, Integer> {
    LinkedListNode<T, Integer> head;

    //kelimelerin hangi dosyada kaç tane olduğunu her BSTNode'u için
    public void addFirst(T fileName, int wordCount) {
        LinkedListNode<T, Integer> newNode = new LinkedListNode<>(fileName, wordCount);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //
//    public T findFile(T fileName) {
//        LinkedListNode<T, Integer> temp = head;
//
//        if (temp != null) {
//            while (!temp.fileName.equals(fileName)) {
//                temp = temp.next;
//            }
//        }
//        return temp.fileName;
//    }

    //wordList linkedList'inden wordCounter'ını arttıracağımız node'u buluyoruz.
    public LinkedListNode<T, Integer> findNode(T fileName) {
        LinkedListNode<T, Integer> temp = head;

        if (temp != null) {
            while (!temp.fileName.equals(fileName)) {
                temp = temp.next;
            }
        }
        return temp;
    }

    //wordList linkedList'in çıktısı
    public void print() {
        LinkedListNode<T, Integer> current = head;

        while (current != null) {
            System.out.print("[" + current.fileName + " , " + current.wordCounter + "] -> ");
            current = current.next;
        }

        System.out.print("null");
    }
}
