package coding;

import java.util.Scanner;

public class TempAir {

    public static void main(String[] args){
        /* contoh pemakaian IF tiga kasus : wujud air */

        /*Kamus*/
//        deklarasi variabel
        int T;

        /*Program*/
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Temperatur (der. C) = ");

        //scanner untuk masukan temperatur air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //masukan temperatur air dengan tipe int

        //proses pengecekan dengan if
        if (T < 0){
            System.out.println("Wujud air beku pada suhu " + T + " celsius");
//            edit air mendidih at 100
        }else if ((0 <= T) && (T < 100))
        {
            System.out.println ("Wujud air cair pada suhu " + T + " celsius");
        }
        else if (T > 99)
        {
            System.out.println("Wujud air uap/gas pada suhu " + T + " celsius");
        }
    }
}