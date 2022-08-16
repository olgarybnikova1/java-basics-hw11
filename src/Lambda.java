import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    public double a;
    public double b;

    /**
     * Function to get max value.
     *
     * @return lambda expression.
     */
    public static BiFunction<Double, Double, Double> getMax() {
        return (a, b) -> Math.max(a, b);

        }

    /**
     * Function to get square root.
     *
     * @return lambda expression.
     */
    public static Function<Double, Double> getSqrt() {
        return Math::sqrt;
    }
}