import java.util.Scanner;

class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            int num = scanner.nextInt();
            total += num;
            System.out.println("현재까지 입력된 정수의 합은 " + total + "입니다.");
        }
    }
}
