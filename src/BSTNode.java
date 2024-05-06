public class BSTNode<T extends Comparable<T>, U> {
    BSTNode<T, U> left;
    BSTNode<T, U> right;
    LinkedList<T, Integer> wordList;
    T data;//kelime
    U fileName;//kelimenin bulunduğu dosya
    int wordCounter;//o dosyada kac tane var?

    public BSTNode(T data, U fileName) {
        this.left = null;
        this.right = null;
        this.wordList = new LinkedList<>();
        this.data = data;
        this.fileName = fileName;
        this.wordCounter = 1;// kelime sayısını tutabilmek için
    }
}
