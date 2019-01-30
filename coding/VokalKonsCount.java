package coding;
//muncul trouble saat akan masukkan import method
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class VokalKonsCount {

    private static int num_vokal(@NotNull String word){
        int i;
        int jumlah_vokal = 0;

        for(i=0; i<word.length(); i++){
//            penambahan huruf kapital di kode
            if(word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'o' || word.charAt(i) == 'A' || word.charAt(i) == 'I' || word.charAt(i) == 'U' ||
                    word.charAt(i) == 'E' ||
                    word.charAt(i) == 'O'){
                jumlah_vokal ++;
            }
        }

        return jumlah_vokal;

    }

    private static int num_konsonan(@NotNull String word){
        int i;
        int jumlah_konsonan = 0;

        for(i=0; i<word.length(); i++){
            char ch = word.charAt(i);
//            logic menggunakan jika bukan vokal
            if(word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' &&
                    word.charAt(i) != 'o' && word.charAt(i) != ' ' && word.charAt(i) != 'A' && word.charAt(i) != 'I'
                    && word.charAt(i) != 'U' &&
                    word.charAt(i) != 'E' &&
                    word.charAt(i) != 'O'){
                jumlah_konsonan ++;

            }
        }

        return jumlah_konsonan;
    }

    public static void main(String[] args){
        /*contoh penggunaan String dengan perulangan*/

        /*Kamus*/
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        /*Program*/

        //masukan kalimat
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        //memanggil prosedur yang mengembalikan nilai int
        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal : " +vokal);
        System.out.println("Jumlah huruf konsonan : " +konsonan);

    }

}