package com.agile.practice.easy;

public class StudentAttendanceRecord551 {

    public static void main(String args[]) {

    }

    public boolean checkRecord (String s){
        char[] ch = s.toCharArray();
        int m = 0;
        int n = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A') m++;
            if (i != ch.length - 2 && i != ch.length - 1 && ch[i] == 'L' && ch[i + 1] == 'L' && ch[i + 2] == 'L')
                n++;
        }
        if (m > 1 || n >= 1) return false;
        return true;
    }

    public boolean checkRecord1 (String s){
        char[] ch = s.toCharArray();
        int m = 0;
        int n = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A') m++;
            int j = 2;
            while (j > 0) {

            }
        }
        if (m > 1 || n >= 1) return false;
        return true;
    }
}
