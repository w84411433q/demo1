package com;

public class Demo1 {

    public static void main(String[] args) {
        f1();
        f2();
    }

    public static void f1(){
        System.out.println("one");
        System.out.println("two");
        f2();
        System.out.println("three");
    }

    public static void f2(){
       for(char c = 0; c < 3; c++){
           if (Character.isLowerCase(c)){
               System.out.println((int)c);
           }
       }
    }
}
