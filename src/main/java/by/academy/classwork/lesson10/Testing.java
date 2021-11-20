package by.academy.classwork.lesson10;

import java.util.regex.Pattern;

public class Testing implements Validators {
    private static final Pattern p = Pattern.compile("^\\+1\\d{10}");

    public Pattern getPattern(){
        return p;
    }

}
