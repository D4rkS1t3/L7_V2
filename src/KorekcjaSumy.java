import java.util.*;
import java.util.stream.Collectors;
/*
Napisz program  pobierający od użytkownika liczby  całkowite dopókiich  sumanie będzie równa 64.
Jeżeli wartość zostanie przekroczona największa liczba z wprowadzonych ma zostać usunięta i pobieranie ma odbywać się dalej. Wykorzystaj sortowanie
 */
public class KorekcjaSumy {
    public static void main(String[] args) {
        int suma = 0;
        boolean trwa = true;
        Integer max;int liczba;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> liczby = new ArrayList<>();
        while (trwa) {
            try {

                System.out.print("Podaj liczbe:");
                liczba = sc.nextInt();
                suma += liczba;
                liczby.add(liczba);
                if (suma==64) {
                    trwa = false;
                }
                else if (suma<64) {
                    System.out.println("za malo");
                    continue;
                }
                else {
                    System.out.println("za duzo");
                    max=Collections.max(liczby);
                    liczby.remove(max);
                    suma-=max;

                }
            } catch (InputMismatchException e) {
                System.out.println("Nie podano liczby calkowitej!!");
                sc.nextLine();
            }
        }

        System.out.println("Udalo sie!");
        List<Integer> posortowane = liczby.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int i : posortowane) {
            System.out.println(i);
        }

    }
}
