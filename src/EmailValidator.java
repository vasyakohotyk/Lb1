public class EmailValidator {
    public static void main(String[] args) {
        System.out.println(validateEmail("test@example.com")); // true
        System.out.println(validateEmail("invalid.email@com")); // false
        System.out.println(validateEmail("user123@domain")); // false
    }

    public static boolean validateEmail(final String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.', atIndex);

        // Перевірка наявності "@" та "." відповідно
        if (atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) {
            // Перевірка символів перед "@" та після "."
            if (isValidCharacters(email.substring(0, atIndex)) &&
                    isValidCharacters(email.substring(dotIndex + 1))) {
                return true;
            }
        }

        return false;
    }

    private static boolean isValidCharacters(String str) {
        for (char c : str.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '-' || c == '_' || c == '.')) {
                return false;
            }
        }
        return true;
    }
}
