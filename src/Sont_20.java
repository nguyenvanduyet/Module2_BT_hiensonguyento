import java.util.Scanner;

public class Sont_20 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can hien thi");
        int numbers = input.nextInt();
        int N = 0;
        int count = 0;
        while(count< numbers){
            boolean check=true;
            if ( N<2)
                check=false;
            else if (N== 2)
                check=true;
            else {
                for (int i = 2; i <N ; i++) {
                    if (N % i ==0)
                        check=false;
                }
            }
            if(check){
                System.out.println("So nguyen to: ");
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}

