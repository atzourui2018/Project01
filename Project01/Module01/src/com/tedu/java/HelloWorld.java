package com.tedu.java;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author
 * @create 2018-11-19 20:57
 */
public class HelloWorld {

    private static int number;

    public HelloWorld() {
    }
    private int a;
    private int b;
    private int c;
    private static final int INITIALSIZE=10;
    public static void main(String[] args) {
        //region Description
        ArrayList arr1 = getArrayList();
        //endregion
        number= 10;

        Date date = new Date();
        arr1.add(0, "a");
        arr1.add(0,"a");
        System.out.println(arr1);

    }

    public static ArrayList getArrayList() {
        String str = new String();
        System.out.println("hello world");
        System.out.println();
        return new ArrayList();

    }

    public int getC() {
        return c;
    }

    public static  void method() throws FileNotFoundException {
        ArrayList arr1 = getArrayList();

        number = 10;
      //  FileInputStream file=new FileInputStream("hello.txt");
    }
}
