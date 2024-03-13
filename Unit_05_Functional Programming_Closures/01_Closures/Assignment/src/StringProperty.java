public class StringProperty {
    public static StringProperty of(String string){
        return new StringProperty(string);
    }

    private String string;
    private StringProperty(String string){
        this.string = string;
    }

    public String get() {
        return string;
    }

    public void set(String newString) {
        this.string = newString;
    }

    public void set(StringProperty newStringProperty) {
        this.string = newStringProperty.get();
    }

    public void more(String addition){
        string += addition;
    }

    public void more(StringProperty addition) {
        string += addition.get();
    }
    public void dumb() {
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return String.valueOf(string);
    }
}