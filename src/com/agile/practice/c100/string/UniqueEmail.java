package com.agile.practice.c100.string;

import java.util.HashSet;

public class UniqueEmail {

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
        if ('.' != '.') System.out.println('.');
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet();
        for (String email : emails) {
            String[] st = email.split("@");
            StringBuilder sb = new StringBuilder();
            for (char ch : st[0].toCharArray()) {
                System.out.println(ch);
                if ((ch != '.') && (ch != '+')) sb.append(ch);
                else if (ch == '+') break;
            }
            sb.append('@').append(st[1]);
            System.out.println(sb.toString());
            set.add(sb.toString());
        }

        return set.size();
    }
}
