

public class Pair<A, B>{
    public A key;
    public B value;

    public Pair(A key, B value){
        this.key = key;
        this.value = value;
    }
    public Pair(Pair<A,B> copy){
        this.key = copy.getKey();
        this.value = copy.getValue();
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
