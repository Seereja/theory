package weekSeven.task4;

import java.util.regex.Pattern;

public class FileValidation {

    private static final Pattern NAME_PATTERN = Pattern.compile("[A-Z][a-z]{1,19}");
    private static final Pattern DATE_PATTERN = Pattern.compile("[0-9]{2}\\.[0-9]{2}\\.{4}");
    private static final Pattern PHON_PATTERN = Pattern.compile("\\+([0-9]{11})");
    private static final Pattern EMALE_PATTERN = Pattern.compile("^[a-z0-9\\_\\-\\*\\.]+@[a-z0-9]+\\.(com|ru)$");


    public static boolean validateName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

    public static boolean validateDate(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }

    public static boolean validatePhone(String phone) {
        return PHON_PATTERN.matcher(phone).matches();
    }

    public static boolean validateEmail(String email) {
        return EMALE_PATTERN.matcher(email).matches();
    }
}
