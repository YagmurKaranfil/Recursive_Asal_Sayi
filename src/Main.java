import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int number, prime ;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        number= scanner.nextInt();

        prime=isPrime(number,number/2);

        if (prime==1){
            System.out.println(number+" sayısı asaldır");
        }else {
            System.out.println(number+" sayısı asal değildir");
        }
    }

   static int isPrime(int number, int i) {
        if (i==1){
            return 1;
        }else {
            if (number%i==0){
                return 0;
            }
            else return isPrime(number,i-1);
        }
    }
}