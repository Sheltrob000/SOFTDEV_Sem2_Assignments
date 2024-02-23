import java.util.Optional;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        Function<Integer, Integer> subtract5 = (num) -> num - 5;
        Function<Integer, Integer> times5 = (num) -> num * 5;
        Function<Integer, Integer> subtract5Times5 = subtract5.andThen(times5);


        int testNumber = 1;
        subtract5Times5.apply(testNumber);


        //Lambda notation examples
        Function<Integer, Integer> add5 = (num) -> num + 5;
        Function<Integer, Integer> div2 = (num) -> num / 2;
        Function<Integer, Integer> add5Divide2 = (num) -> {
            num = num + 5;
            num = num / 5;
            return num;
        };

        Function<Integer, Integer> add5Divide2UsingAndThen = add5.andThen(div2);

        Optional<Integer> myIntOption = Optional.of(3);

        Optional<Integer> myIntAdd5Option = myIntOption.map(add5);
        Optional<Integer> myIntAdd5Div2Option = myIntOption.map(add5Divide2UsingAndThen);
        System.out.println(myIntOption);
        System.out.println(myIntAdd5Option);
        System.out.println(myIntAdd5Div2Option);

        Function<Integer, Optional<Integer>> add5Optional = (num) -> Optional.of(num + 5);

        Optional<Integer> myflatmapEmptyExample = Optional.empty();
        var myFlatmapExample = myIntOption.flatMap(add5Optional);
        var myFlatmapExampleExampleTest = myflatmapEmptyExample.flatMap(add5Optional);

        System.out.println(myFlatmapExample);
        System.out.println(myFlatmapExampleExampleTest);

    }

}
