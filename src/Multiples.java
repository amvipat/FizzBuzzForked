public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10; i++){
            count = divisibleByThreeOrFive(i, count);
        }
        System.out.println("There are " + count + " divisible by 3 and 5.");
    }

    private static int divisibleByThreeOrFive(int i, int count) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 || divisibleBy5 ){
            count++;
        }
        return count;
    }

}
