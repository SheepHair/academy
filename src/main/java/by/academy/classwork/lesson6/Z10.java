package by.academy.classwork.lesson6;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z10 {
    private static final String str = "Java \\d+";
    private static final Pattern pattern = Pattern.compile(str);


    public static void main(String[] args) {
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";

        Matcher m = pattern.matcher(text);
        while(m.find()){
            int start = m.start();
            int end = m.end();
            System.out.println(text.substring(start, end));
        }
//        String str = new String("“Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”");
//        Pattern pattern = Pattern.compile("Java /d+");
//        System.out.println();
//        System.out.println(pattern);
    }
}
