package com.company._36ThirtySix;

//! String is "OBJECT" in JAVA, not a data type like other languages
public class AllAboutString {
    public static void main(String[] args) {

        char x = 'A';
        char y = 'B';
        System.out.println(x + " " + y); //! It will print the character
        System.out.println(x + y); //! It will concatenate ASCII value, which is A = 65, B = 66
        System.out.println("Type of " + x + " is " + ((Object) x).getClass().getSimpleName());

        String z = "Hello Brother, !@#$%^&*"; //! Space also count in string

        //! Find the length of the String
        int result = z.length();
        System.out.println(result);

        //! Concatenate two strings
        String a = "Apple";
        String b = "Banana";

        System.out.println(a + b);

        //! Find which char is present on which index
        for (int j = 0; j < a.length(); j++) {
            System.out.println(j + " --> " + a.charAt(j));
        }

        //! SubString
        String m = z.substring(0, 12); //! substring(Start index and Last index)
        System.out.println(m);

        //! change char to string
        String chan = Character.toString(x);
        System.out.println("Change the type of "+ chan + " and now its type is " + chan.getClass().getSimpleName());

        //! Change string to char
        for (int i = 0; i < b.length(); i++) {
            System.out.println(i + " --> " + b.charAt(i));
        }
    }
}