package PBO11_Praktikum2;
import java.lang.Exception;

public class Exception_1 extends Exception{
    public static void main(String[] args) {
        int a[]=new int[5];
        try
        {
         a[5]=100;
        }
        catch(Exception e)
        {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}
