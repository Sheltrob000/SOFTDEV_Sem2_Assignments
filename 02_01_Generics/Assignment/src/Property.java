public class Property<T> {

    private T t;

    public Property(T t){
        this.t = t;
    }

    public Property(){
        this.t = null;
    }

    public T get(){
        return this.t;
    }

    public void set(T t){
        this.t = t;
    }
    
}