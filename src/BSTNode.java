public class BSTNode<T extends Comparable<T>> {
    BSTNode<T> left;
    BSTNode<T> right;
    LinkedList<T, Integer> wordList;
    T data;//kelime
    String fileName;//kelimenin bulunduğu dosya
    int wordCounter;//o dosyada kac tane var?

    public BSTNode(T data, String fileName) {
        this.left = null;
        this.right = null;
        this.wordList = new LinkedList<>();
        this.data = data;
        this.fileName = fileName;
        this.wordCounter = 1;// kelime sayısını tutabilmek için
    }
}
