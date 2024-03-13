import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        Function<Integer, Integer> add5Func = (number) -> number + 5;
        Function<Integer, Double> div2 = (number) -> number / 2.0;
        Consumer<Integer> intPrinter = (number) -> System.out.println(number);
        Consumer<Double> doublePrinter = (number) -> System.out.println(number);


        List<Integer> ints = IntStream.rangeClosed(0, 10).boxed().toList();

        List<Integer> intsPlus5 = ints.stream().map(add5Func).toList();
        intsPlus5.stream().forEach(intPrinter);

        List<Double> intsPlus5Div2 = intsPlus5.stream().map(div2).toList();
        intsPlus5Div2.stream().forEach(doublePrinter);
    }
}
