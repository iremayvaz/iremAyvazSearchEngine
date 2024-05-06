public class LinkedList<T extends Comparable<T>, U> {
    LinkedListNode<T, U> head;

    public void addFirst(T fileName, U count) {
        LinkedListNode<T, U> newNode = new LinkedListNode<>(fileName, count);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public T findFile(T fileName) {
        LinkedListNode<T, U> temp = head;

        if (temp != null) {
            while (!temp.fileName.equals(fileName)) {
                temp = temp.next;
            }
        }
        return temp.fileName;
    }

    public void print() {
        LinkedListNode<T, U> current = head;
        while (current != null) {
            System.out.print("[" + current.fileName + " , " + current.wordCounter + "] -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
