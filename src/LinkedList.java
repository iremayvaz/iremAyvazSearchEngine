public class LinkedList <T extends Comparable<T>>{
    LinkedListNode<T> head;
//    public void addNext(T data, String fileName){
//        LinkedListNode<T> newNode = new LinkedListNode<>(data, fileName);
//
//        if (head == null) {
//            head = newNode;
//        } else {
//            LinkedListNode<T> temp = head;
//
//            while(temp.next != null){
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }
    public void addFirst(T fileName, int count){
        LinkedListNode<T> newNode = new LinkedListNode<>(fileName, count);

        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void findFile(T fileName){
        LinkedListNode<T> temp = head;

        if(temp != null){
            while(!temp.fileName.equals(fileName)){
                temp = temp.next;
            }
            System.out.println(temp.fileName);
        }
    }
    public void print(){
        LinkedListNode<T> current = head;
        while (current != null) {
            System.out.print(current.fileName + " , " + current.wordCounter + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
