package by.academy.classwork.lesson10;

import java.util.regex.Pattern;

public interface Valid {
    Pattern getPattern();

    default boolean isValid(String s) {
        return getPattern().matcher(s).matches();
    }
}
