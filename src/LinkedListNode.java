public class LinkedListNode <T extends Comparable<T>>{
    LinkedListNode<T> next;
    T fileName;
    int wordCounter;
    public LinkedListNode(T fileName, int wordCounter){
        this.fileName = fileName;
        this.wordCounter = wordCounter;
        this.next = null;
    }
}
