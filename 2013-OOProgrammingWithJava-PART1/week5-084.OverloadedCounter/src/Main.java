public class Main {
    public static void main(String[] args) {
        // write testcode here

        Counter licznik = new Counter();
        System.out.println(licznik.value());
        licznik.decrease(5);
        System.out.println(licznik.value());
        System.out.println("---");

        Counter licznik2 = new Counter(5);
        System.out.println(licznik2.value());
        licznik2.increase(2);
        System.out.println(licznik2.value());
        System.out.println("---");

        Counter licznik3 = new Counter(false);
        System.out.println(licznik3.value());
        licznik3.decrease(22);
        licznik3.increase(5);
        licznik3.increase(5);
        licznik3.decrease(3);
        System.out.println(licznik3.value());
        System.out.println("---");

        Counter licznik4 = new Counter(1, false);
        System.out.println(licznik4.value());
        licznik4.decrease(2);
        licznik4.decrease(3);
        licznik4.decrease(4);
        System.out.println(licznik4.value());
        System.out.println("---");

    }
}
