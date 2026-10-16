public class Main {

    public static void main(String[] args) {
        printLine(5, '*');                                    // *****

        System.out.println("square(7) = " + square(7));       // 49
        System.out.println("max(12, 8) = " + max(12, 8));     // 12
        System.out.println("isEven(10) = " + isEven(10));     // true
        System.out.println("isEven(7) = " + isEven(7));       // false

        double[] grades = {12.0, 15.5, 9.0, 17.5};
        System.out.println("average = " + average(grades));   // 13.5

        System.out.println("vowels = " + countVowels("Programming in Java"));   // 6
    }

    // Prints the character c, n times, on the same line
    public static void printLine(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Returns x * x
    public static int square(int x) {
        return x * x;
    }

    // Returns the bigger of the two numbers (without Math.max)
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    // Returns true if n is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Returns the average of the values in the array
    public static double average(double[] values) {
        double sum = 0;
        for (double v : values) {
            sum += v;
        }
        return sum / values.length;
    }

    // Returns how many vowels the text has
    public static int countVowels(String text) {
        String lower = text.toLowerCase();   // so 'A' and 'a' both count
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
