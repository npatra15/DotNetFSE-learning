// File: Forecast.java
public class Forecast {

    // Recursive method to calculate future value
    public static double forecastValueRecursive(double initialValue, double rate, int years) {
        if (years == 0) return initialValue;
        return forecastValueRecursive(initialValue, rate, years - 1) * (1 + rate);
    }

    // Optimized using memoization (optional)
    public static double forecastMemo(double initialValue, double rate, int years, Double[] memo) {
        if (years == 0) return initialValue;
        if (memo[years] != null) return memo[years];

        memo[years] = forecastMemo(initialValue, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
