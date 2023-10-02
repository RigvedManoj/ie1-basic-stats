import java.util.List;

public class MinMaxCalculation {
    public static double getMin (double[] arr){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static double getMax (double[] arr){
        double max = -1*(Double.MAX_VALUE);
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}