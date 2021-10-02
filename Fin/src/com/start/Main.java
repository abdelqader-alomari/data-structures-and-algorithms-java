package com.start;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Marah, Hello Deyaa , 401");
        System.out.println(fin(6));
    }
    public static int fin(int a ){
        if (a<=1){
            return a;
        }
        return fin(a-1) + fin(a-2);
    }
}
