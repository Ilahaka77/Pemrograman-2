//import java.util.Scanner;

public class LuasSegitiga{
    public static void main(String[] args){
        int a = 5; 
        int t = 5;
        double luas;

       /* Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan nilai Alas : ");
        a = sc.nextInt();
        System.out.print("\nMasukan nilai Tinggi : ");
        t = sc.nextInt();
        */

        luas = (a * t)/2f;
        System.out.println("alas x tinggi = " + luas);
    }
}