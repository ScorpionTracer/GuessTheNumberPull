public class GuessTheNumberPull {
    import java.util.Scanner;

    public class GuessTheNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ваша задача удагать число");
            int range = 10;
            int number = (int) (Math.random() * range);
            while (true) {
                System.out.println("Угадайте число от 0 до " + range);
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Вы угадали число");
                    break;
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
            scanner.close();
        }
    }
}
