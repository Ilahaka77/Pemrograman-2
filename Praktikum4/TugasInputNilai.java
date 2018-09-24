import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TugasInputNilai{
    public static void main(String[] args){
        String nama, nim, matkul;
        float nilai_lain = 0, nilai_uts = 0, nilai_uas = 0, nilai_akhir = 0;

        BufferedReader dInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan NIM : ");
        try{
            nim = dInput.readLine();
        }catch(IOException e){
            System.out.println("Error...!!");
        }

        System.out.print("Masukan Matakuliah : ");
        try{
            matkul = dInput.readLine();
        }catch(IOException e){
            System.out.println("Error...!!");
        }

        System.out.print("Masukan Nama : ");
        try{
            nama = dInput.readLine();
        }catch(IOException e){
            System.out.println("Error...!!");
        }

        System.out.print("Masukan Nilai Lain-lain : ");
        try{
            nilai_lain = Float.parseFloat(dInput.readLine());
        }catch(IOException e){
            System.out.println("Error...!!");
        }

        System.out.print("Masukan Nilai UTS : ");
        try{
            nilai_uts = Float.parseFloat(dInput.readLine());
        }catch(IOException e){
            System.out.println("Error...!!");
        }

        System.out.print("Masukan Nilai UAS : ");
        try{
            nilai_uas = Float.parseFloat(dInput.readLine());
        }catch(IOException e){
            System.out.println("Error...!!");
        }

        //nilai akhir = (40%*N.L) + (30%*N.UTS) + (30%*N.UAS)
        nilai_akhir = ((0.4F * nilai_lain) + (0.3F * nilai_uts) + (0.3F * nilai_uas));
        System.out.println("Nilai Akhir = " + nilai_akhir);
        if(nilai_akhir >= 80){
            System.out.println("Grade A");
        }else if(nilai_akhir >= 76 && nilai_akhir <= 79){
            System.out.println("Grade AB");
        }else if(nilai_akhir >= 71 && nilai_akhir <= 75){
            System.out.println("Grade B");
        }else if(nilai_akhir >= 66 && nilai_akhir <= 70){
            System.out.println("Grade BC");
        }else if(nilai_akhir >= 61 && nilai_akhir <= 65){
            System.out.println("Grade C");
        }else if(nilai_akhir >= 56 && nilai_akhir <= 60){
            System.out.println("Grade CD");
        }else if(nilai_akhir >= 51 && nilai_akhir <= 55){
            System.out.println("Grade D");
        }else if(nilai_akhir <= 50){
            System.out.println("Grade E");
        }
    }
}