import java.util.Arrays;


public class MathUtils {
    static double LaskeYhteen(double[] nums) {
        return Arrays.stream(nums)
                .sum();
    }

    static double SuurinLuku(double[] nums) {
        return Arrays.stream(nums)
                .max()
                .orElseThrow(IllegalStateException::new);
    }

    static double LaskeKeskiarvo(double[] nums) {
        return LaskeYhteen(nums) / nums.length;
    }
}