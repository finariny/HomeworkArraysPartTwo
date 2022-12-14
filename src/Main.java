public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        int[ ] arr = generateRandomArray();
        System.out.println("Задача 1");
        int sum = 0;
        for (int current : arr) {
            sum += current;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2 () {
        int[ ] arr = generateRandomArray();
        System.out.println("Задача 2");
        int minSumDay = arr[0];
        int maxSumDay = arr[0];
        for (int current : arr) {
            if (current >= maxSumDay) {
                maxSumDay = current;
            }
            if (current <= minSumDay) {
                minSumDay = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumDay + " рублей. Максимальная сумма трат за день составила " + maxSumDay + " рублей");
    }

    public static void task3 () {
        int[ ] arr = generateRandomArray();
        System.out.println("Задача 3");
        int totalSum = 0;
        for (int current : arr) {
            totalSum += current;
        }
        double middleSum = (totalSum * 1.0) / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleSum + " рублей");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}