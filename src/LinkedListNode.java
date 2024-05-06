public class LinkedListNode<T extends Comparable<T>, U> {
    LinkedListNode<T, U> next;
    T fileName;//data
    U wordCounter;//key

    public LinkedListNode(T fileName, U wordCounter) {
        this.fileName = fileName;
        this.wordCounter = wordCounter;
        this.next = null;
    }
}
