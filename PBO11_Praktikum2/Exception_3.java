package PBO11_Praktikum2;

import java.lang.Exception;

public class Exception_3 extends Exception3{
    
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}