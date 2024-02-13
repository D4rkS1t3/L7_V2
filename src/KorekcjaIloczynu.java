import java.util.*;
import java.util.stream.Collectors;

public class KorekcjaIloczynu {
    public static void main(String[] args) {
        boolean trwa=true;int liczba;int iloczyn=1;Integer min;
        ArrayList<Integer> lista=new ArrayList<Integer>();
        Scanner sc =new Scanner(System.in);
        while (trwa) {
            try {
                System.out.print("Podaj liczbe:");
                liczba=sc.nextInt();
                if (liczba==0) {
                    iloczyn=1;
                    continue;
                }
                iloczyn*=liczba;
                lista.add(liczba);
                if (iloczyn==256) {
                    trwa=false;
                }
                else if (iloczyn<256){
                    System.out.println("Za malo");
                }
                else {
                    System.out.println("Za duzo!!");
                    min= Collections.min(lista);
                    lista.remove(min);
                }
            } catch (InputMismatchException e) {
                System.out.println("Podaj liczbe calkowita");
                sc.nextLine();
            }
        }
        System.out.println("Udalo sie!");
        List<Integer> posortowane = lista.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int i : posortowane) {
            System.out.println(i);
        }
    }
    /*Napisz program pobierający od użytkownika liczby całkowite dopókiich  iloczynnie będzie równy 256.
     Jeżeli wartość zostanie przekroczona najmniejsza liczba z wprowadzonych ma zostać usunięta i pobieranie ma odbywać się dalej.
      Wykorzystaj sortowanie.
     */

}
