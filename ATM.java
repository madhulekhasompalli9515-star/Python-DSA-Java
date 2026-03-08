import java.util.*;
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 12000;
        int pin = 1234;
        System.out.println("enter amount to withdraw:");
        int w = sc.nextInt();
        System.out.println("enter pin:");
        int pin1 = sc.nextInt();
        if (pin1 != pin) {
            System.out.println("incorrect pin");
        }
        if (pin1 == pin) {
            if (w <= balance) {
                System.out.println("success");
            } else {
                System.out.println("insufficient balance");
            }
        } else {
            System.out.println("error");
        }

    }
}
