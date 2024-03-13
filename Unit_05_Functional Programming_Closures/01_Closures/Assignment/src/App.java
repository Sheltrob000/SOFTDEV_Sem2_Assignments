import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        Function<Integer, Integer> add5 = (integer) -> integer + 5;

        System.out.println(add5.apply(2));
        System.out.println(add5.apply(2));

        int startValue = 15;
        Function<Integer, Integer> addStartValueToInteger = (integer) -> {
            return integer + startValue;
        };

        // //THIS BE OUR CLOSURE
        IntegerProperty startProperty = IntegerProperty.of(15);
        Function<IntegerProperty, IntegerProperty> addToStartProperty = (integer) -> {
            startProperty.plus(integer);
            return startProperty;
        };

        Function<Integer, IntegerProperty> DivStartPropertyByInt = (integer) -> {
            startProperty.set(startProperty.get() / integer);
            return startProperty;
        };



        DoubleProperty doubleProperty = DoubleProperty.of(5.0);
        Function< DoubleProperty, DoubleProperty> addTodoubleProperty = (doublenum) ->{
            doubleProperty.plus(doublenum);
            return doubleProperty;
        };


        StringProperty stringProperty = StringProperty.of("hello");
        Function <StringProperty, StringProperty> addToStringProperty = (secondString) ->{
            stringProperty.more(secondString);
            return stringProperty;
        };

        StringProperty stringProperty2 = StringProperty.of(" world");
        addToStringProperty.apply(stringProperty2);
        System.out.println(stringProperty);
    }
}
