package dz3task01;
public class PasswordVerifier {
    public static void verification(String password) throws VerificationPasswordException {
        if (password.length() < 8) {
            throw new VerificationPasswordException("Пароль должен быть не менее 8 символов");
        }
        if (!password.matches("(?=.*[0-9]).*")) {
            throw new VerificationPasswordException("Пароль должен содержать хотя бы одну цифру");
        }
        if (!password.matches("(?=.*[A-Z]).*")) {
            throw new VerificationPasswordException("Пароле должен содержать хотя бы одну заглавную букву");
        }
    }
}
