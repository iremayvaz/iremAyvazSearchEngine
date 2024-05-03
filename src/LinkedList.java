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
        if(head != null){
            LinkedListNode<T> temp = head;
            while(!head.fileName.equals(fileName)){
                temp = temp.next;
            }
        }
    }
    public void print(){
//        LinkedListNode<T> temp = head;
//
//        while(temp != null){
//            System.out.println(temp + " -> ");
//        }
//
//        System.out.println("null");//?
        LinkedListNode<T> current = head;
        while (current != null) {
            System.out.print(current.fileName + " , " + current.wordCounter + " -> ");
            current = current.next;
        }
    }
}
