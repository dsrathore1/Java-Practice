package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class Experiment4 {
    public static boolean isNumber(String s) {
        boolean digitseen = false, eseen = false, dotseen = false;
        int countSign = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
// digit
            if (Character.isDigit(ch)) digitseen = true;
// minus/plus
            else if (ch == '+' || ch == '-') {
                if (countSign == 2) return false;
// case like 6+0
                if (i > 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')) return false;
                if (i == (s.length() - 1)) return false;
                countSign++;
            }
// dot
            else if (ch == '.') {
// cases like e., .7.
                if (eseen || dotseen) return false;
// edge case -> .
                if (i == s.length() - 1 && !digitseen) return false;
                dotseen = true;
            }
// e/E
            else if (ch == 'e' || ch == 'E') {
// cases like-> ee, e45, 45e
                if (eseen || !digitseen || i == (s.length() - 1)) return false;
                eseen = true;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int count = 0;
        String line;
        FileReader file = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(file);
        while ((line = br.readLine()) != null) {
            String[] words = line.split(",");
            for (String s : words) {
                if (isNumber(s)) {
// System.out.println(s);
                    count++;
                }
            }
        }
        System.out.println("There are: " + count + " words in the file");
        br.close();
    }
}