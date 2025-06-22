// File: Main.java
public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;   // ₹1000
        double growthRate = 0.1;        // 10% annual
        int years = 5;

        // Basic Recursive Forecast
        double result = Forecast.forecastValueRecursive(initialValue, growthRate, years);
        System.out.printf("Future Value (Recursive): ₹%.2f%n", result);

        // Optimized with memoization
        Double[] memo = new Double[years + 1];
        double resultMemo = Forecast.forecastMemo(initialValue, growthRate, years, memo);
        System.out.printf("Future Value (Memoized): ₹%.2f%n", resultMemo);
    }
}
