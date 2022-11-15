package com.isPalindrom;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        String s = in.next();
        int j = 0;

        char a1 [] = new char[s.length()];
        char a2 [] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            a1[i] = s.charAt(i);
        }
        for (int i = s.length()-1; i >=0; i--) {
            a2[j] = s.charAt(i);
            j++;
        }

        if (Arrays.equals(a1,a2)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
