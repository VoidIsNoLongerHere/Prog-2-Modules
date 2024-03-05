

public class Pair<A, B>{
    public A key;
    public B value;

    public Pair(A key, B value){
        this.key = key;
        this.value = value;
    }
    public Pair (A key){
        this.key = key;
        this.value = null;
    }

    public A getKey() {
        return key;
    }

    public B getValue() {
        return value;
    }
}
