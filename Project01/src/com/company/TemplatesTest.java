package com.company;

import com.tedu.java.HelloWorld;

import java.util.ArrayList;

/**
 * @author
 * @create 2018-11-22 20:16
 */
public class TemplatesTest {
    //模板六：prsf
    private static final HelloWorld cust=new HelloWorld();

    //变形：psf
    public static final int START=1;

    //变形：psfi
    public static final int NUM2=2;

    //变形：psfs
    public static final String CHINA="china";

    //模板一 ：psvm

    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello");
        //变形 soutp/soutm/soutv/xxx.sout
        int num=1;
        System.out.println("num = " + num);
        System.out.println(num);
        System.out.println("num = [" + num + "]");
        System.out.println("TemplatesTest.main");


        String arr[]=new String[]{"lilei","hanmeimei","jerry","tom"};
        //模板三：fori
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter
        for (String s : arr) {
            System.out.println(s+"!");
        }

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list=new ArrayList();
        list.add(1123);
        list.add(2231);
        list.add(1233);
        for (Object o : list) {

        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板五:ifn
        ArrayList list1=new ArrayList();
        list.add(1123);
        list.add(2231);
        list.add(1233);
        if (list1 == null) {

        }

        //变形：inn
        if (list1 != null) {

        }
    }
}
