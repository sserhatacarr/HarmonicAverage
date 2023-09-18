public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (double number : numbers) {
            sum += 1 / number;
        }
        System.out.println(numbers.length / sum);
    }
}
