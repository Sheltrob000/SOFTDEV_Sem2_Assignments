import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class App {
    public static void main(String[] args) throws Exception {

        BiFunction<Integer, Integer, Integer> randoGenerator = (min, max) -> {
            int size = max - min + 1;
            double rando = size * Math.random();
            return (int) Math.floor(rando);
        };

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> randoGenerator.apply(0, 10));

        System.out.println(future.get());
    }

}
