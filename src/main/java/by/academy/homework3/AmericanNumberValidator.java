package by.academy.homework3;

import java.util.regex.Pattern;

public class AmericanNumberValidator {

    private static final Pattern p = Pattern.compile("^\\+1\\d{10}");

    public Pattern getPattern() {
        return p;
    }

}
