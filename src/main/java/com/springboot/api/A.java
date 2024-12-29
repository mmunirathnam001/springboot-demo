package com.springboot.api;

public class A {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("MADAM");

        if(sb.toString().equals(sb.reverse().toString()))
        {
            System.out.println("Given String is palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
