public class EmailValidator {
    public static void main(String[] args) {
        System.out.println(validateEmail("test@example.com"));
        System.out.println(validateEmail("invalid.email@com"));
        System.out.println(validateEmail("user123@domain"));
    }

    public static boolean validateEmail(final String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.', atIndex);

        if (atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) {
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
