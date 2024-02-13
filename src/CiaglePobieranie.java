import java.util.InputMismatchException;
import java.util.Scanner;

public class CiaglePobieranie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int liczba;int suma=0;int iloczyn=1;int ileLiczb=0;
        boolean wprowadzamy=true;
        System.out.println("/////Wprowadzanie liczb////");
        while (wprowadzamy) {
            try {
                System.out.print("Wprowadz liczbe:");
                liczba= sc.nextInt();
                if (liczba==0) {
                    if (ileLiczb==0) {
                        iloczyn=0;
                    }
                    wprowadzamy=false;
                }
                else {
                    ileLiczb++;
                    suma += liczba;
                    iloczyn *= liczba;
                }
            } catch (InputMismatchException e) {
                System.out.print("Podaj liczbe calkowita!!!\nA nie: ");
                System.out.println(sc.nextLine());
            }

        }
        System.out.printf("Wprowadzono %d liczb, suma liczb jest rowna %d," +
                " iloczyn liczb jest rowny %d", ileLiczb, suma, iloczyn);
    }
}
