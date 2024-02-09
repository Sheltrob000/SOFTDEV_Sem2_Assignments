import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        double cFromOO = lawOfCosinesOO(1, 1, 90);
        double cFromFPDumb = lawOfCosineFPDumb.apply(1.0, 1.0, 90.0);
        var cFromFPSmart = lawOfCosinesSmart.apply(1.0).apply(1.0);
        System.out.println(cFromOO);
        System.out.println(cFromFPDumb);
        System.out.println(cFromFPSmart);
    }

    public static double lawOfCosinesOO(double a, double b, double angDegrees) {
        double angRadians = Math.toRadians(angDegrees);
        double cosinePart = 2 * a * b * Math.cos(angRadians);
        double aSq = a * a;
        double bSq = b * b;
        return Math.sqrt(aSq + bSq - cosinePart);
    }

    public static TriFunction<Double, Double, Double, Double> lawOfCosineFPDumb = (a, b, angDegrees) -> {
        double angRadians = Math.toRadians(angDegrees);
        double cosinePart = 2 * a * b * Math.cos(angRadians);
        double aSq = a * a;
        double bSq = b * b;
        return Math.sqrt(aSq + bSq - cosinePart);
    };
    public static Function<Double, Function<Double, Function<Double, Double>>> lawOfCosinesSmart = (
            a) -> (b) -> (angDegrees) -> {
                double angRadians = Math.toRadians(angDegrees);
                double cosinePart = 2 * a * b * Math.cos(angRadians);
                double aSq = a * a;
                double bSq = b * b;
                return Math.sqrt(aSq + bSq - cosinePart);
            };

    // TODO: write a function called lawOfCosinesAngle
    public static Function<Double, Function<Double, Function<Double, Double>>> lawOfCosinesAngleC = (
            a) -> (b) -> (c) -> {

                //angleC = acos((c^2 - a^2 - b^2) / (-2ab))

            };

}
