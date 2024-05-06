public class LinkedListNode<T extends Comparable<T>, Integer> {
    LinkedListNode<T, Integer> next;
    T fileName;//data
    int wordCounter;//key

    public LinkedListNode(T fileName, int wordCounter) {
        this.fileName = fileName;
        this.wordCounter = wordCounter;
        this.next = null;
    }
}
