/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.math.*;
public class Ex {
    public static void main(String[] e){
        Scanner next= new Scanner (System.in);
        String a= next.next();
        String b= next.next();
        /*System.out.println("Result1: "+extraEnd(a));
        System.out.println("Result2: "+makeAbba(a,b));*/
        System.out.println("Result3: "+seeColor(a));
    }

    private static String extraEnd(String a) {
        String s= a.substring(a.length()-4, a.length());
        return s+s+s;
        /*Lấy độ dài của chuỗi rồi đếm thứ tự từ phải sang trái, sau đó đem cộng lại chuỗi lấy ra được*/
//To change body of generated methods, choose Tools | Templates.
    }

    private static String makeAbba(String a, String b) {
        return a+b+b+a;
 //To change body of generated methods, choose Tools | Templates.
    }

    private static String seeColor(String a) {
        if(a.startsWith("red"))
            System.out.println("Red");
        else if(a.startsWith("blue"))
            System.out.println("Blue");
 //To change body of generated methods, choose Tools | Templates.
        return "";
    }
    
}
