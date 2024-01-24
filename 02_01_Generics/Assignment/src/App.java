public class App {
    public static void main(String[] args) throws Exception {

        Property<String> myStringProperty = new Property<String>();
        myStringProperty.set("Hi");
        System.out.println(myStringProperty.get());
        myStringProperty.set("Hello");
        System.out.println(myStringProperty.get());

        Property<Integer> myInteger = new Property<Integer>();
        myInteger.set(3);
        System.out.println(myInteger.get());
        myInteger.set(2);
        System.out.println(myInteger.get());

        Property<Boolean> myBooleanProperty = new Property<Boolean>();
        myBooleanProperty.set(true);
        System.out.println(myBooleanProperty.get());
        myBooleanProperty.set(false);
        System.out.println(myBooleanProperty.get());

    }
}