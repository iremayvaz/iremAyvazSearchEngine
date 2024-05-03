public class BSTNode<T extends Comparable<T>>{
    BSTNode left;
    BSTNode right;
    T data;
    int wordCounter;
    public BSTNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.wordCounter = 1;// kelime sayısını tutabilmek için
    }
}
