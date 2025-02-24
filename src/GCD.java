public class GCD {
    public static void main(String[] args){

        GCDCalculator gcd = (a, b) -> {
            while (b != 0){
                int oldB = b;
                b = a % b;
                a = oldB;
            }
            return a;
        };
    }
    @FunctionalInterface
    public interface GCDCalculator{
        int gcd(int a, int b);

    }
}

// gdc of 12, 8, 8 is what?
// 12 -> 2, 2, 3
//8 -> 2, 2,
// gdc 2 * 2 = 4