public class IntegerProperty {
    public static IntegerProperty of(int value){
        return new IntegerProperty(value);
    }

    private int value;

    private IntegerProperty(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    public IntegerProperty plus(IntegerProperty value) {
        this.value += value.get();
        return this;
    }

    public IntegerProperty minus(IntegerProperty value) {
        this.value -= value.get();
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
