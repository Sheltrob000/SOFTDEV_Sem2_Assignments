public class Property<T extends Comparable<T>> implements Inequality<T> {

    private T t;

    public Property(T t) {
        this.t = t;
    }

    public Property() {
        this.t = null;
    }

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    @Override
    public boolean isGreaterThan(Property<T> other) {
        if (t.compareTo(other.t) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isLessThan(Property<T> other) {
        if (t.compareTo(other.t) == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEqual(Property<T> other) {
        return isEqual(other);
    }

    @Override
    public boolean isNotEqual(Property<T> other) {
        return !isEqual(other);
    }

    @Override
    public boolean isGreaterThanOrEqual(Property<T> other) {
        if (t.compareTo(other.t) == 1 || isEqual(other)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isLessThanOrEqual(Property<T> other) {
        if (t.compareTo(other.t) == -1 || isEqual(other)){
            return true;
        }else{
            return false;
        }
    }

}