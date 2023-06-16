public class MethodsExercises {
    public static int addition(int x, int y) {
        return x + y;
    };
    public static int subtraction(int x, int y) {
        return x - y;
    };
    public static int multiplication(int x, int y) {
        return x * y;
    };

    public static int theLongWay(int x, int y) {
        int sum = 0;
      for (int i = 1; i <= x; i++) {
          sum = sum + y;
      }
      return sum;
    };

    public static int division(int x, int y) {
        return x / y;
    };

    public static int remainder(int x, int y) {
        return x % y;
    };

    public static void main(String[] args) {
        System.out.println(theLongWay(12, 12));
    }
}
