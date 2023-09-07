package dz3task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Введите пароль: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String password = scanner.nextLine();
            PasswordVerifier.verification(password);
            System.out.println("Пароль корректный");
        } catch (VerificationPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
