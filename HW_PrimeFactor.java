//se_5630213011_jakkrit_laihuad

package primefactor;

import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {

        int inputnumber, primenumber;
        Scanner in = new Scanner(System.in);

        System.out.println("Exit ,Enter 0\n");
        do {       System.out.print("Enter number : ");
                   inputnumber = in.nextInt();

                   System.out.print("Resultant : ");
                   
            for (int i = 2; i <= inputnumber; i++) {
                
                while (inputnumber % i == 0) {
                    primenumber = i;
                    inputnumber = inputnumber / primenumber;
                    System.out.print(primenumber);
                
                    if (inputnumber >= primenumber) {
                        System.out.print(" x ");
                    }
                }
            }   System.out.print("\n\n");
        }   while (inputnumber != 0);

    }

}
