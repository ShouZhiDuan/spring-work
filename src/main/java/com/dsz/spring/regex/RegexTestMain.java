package com.dsz.spring.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/23 14:27
 * @Description:
 */
public class RegexTestMain {

    private static String txt = "\"imagePath\":\"/group1/M00/00/1B/rBQ-CGJo1GOAB-MsAA1jAa4o5mE505.png\",\"imagePath\":\"/group2/M00/00/1B/rBQ-CGJo1GOAB-MsAA1jAa4o5mE505.png\"";

    public static void main(String[] args) {
        String regex_1 = "^imagePath+.*png$";
        Pattern p1 = Pattern.compile(regex_1);
        Matcher matcher = p1.matcher(txt);
        while (matcher.find()){
            System.out.println(matcher);
        }
    }
}
