import java.util.*;
import java.util.stream.Collectors;

public class Sortowanie {
    public static void main(String[] args) {
        int suma = 0;
        int iloczyn = 1;
        boolean trwa = true;
        int liczba;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> liczby = new ArrayList<>();
        while (trwa) {
            try {

                System.out.print("Podaj liczbe:");
                liczba = sc.nextInt();
                suma += liczba;
                iloczyn *= liczba;
                liczby.add(liczba);
                if (Math.abs(suma) > 250 || Math.abs(iloczyn) > 3000000) {
                    trwa = false;

                }
            } catch (InputMismatchException e) {
                System.out.println("Nie podano liczby calkowitej!!");
                sc.nextLine();
            }
        }

        List<Integer> posortowane = liczby.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int i : posortowane) {
            System.out.println(i);
        }

    }


}
