public class LinkedList <T>{
    LinkedListNode<T> head;
    public void addNext(T data){
        LinkedListNode<T> newNode = new LinkedListNode<>(data);

        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode<T> temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print(){
        LinkedListNode<T> temp = head;

        while(temp != null){
            System.out.println(temp + " -> ");
        }

        System.out.println("null");//?
    }
}
