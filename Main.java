import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int say=input.nextInt();
        int toplam=0,count=0;

        for (int i=1;i<say;i++){

            if (i%12==0){
                toplam+=i;
                count++;
            }
        }
        System.out.println("12ye bölünen sayıların ortalaması: "+(toplam/count));
    }
}