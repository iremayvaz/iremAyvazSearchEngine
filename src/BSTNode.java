public class BSTNode<T extends Comparable<T>>{
    BSTNode<T> left;
    BSTNode<T> right;
    LinkedList<T> wordList;
    T data;
    T fileName;
    int wordCounter;
    public BSTNode(T data){
        this.left = null;
        this.right = null;
        this.wordList = new LinkedList<>();
        this.data = data;
        this.fileName = null;
        this.wordCounter = 1;// kelime sayısını tutabilmek için
    }
}
