public class Petr5 {
    public static void main(String[] args) {
        int dream = 5;
        System.out.println("Пётр мечтает получить:");
        System.out.println(dream);
        double srednBalPetr = 3.49;
        System.out.println("Пётр очень старался и улучшил свой средний бал на:");
        int pribavka = 1;
        System.out.println(pribavka);
        System.out.println("В итоге его средний бал составил:");
        srednBalPetr = srednBalPetr + 1;
        System.out.println(srednBalPetr);
        double prochodnojBal = 4.5;
        boolean poluchil = (srednBalPetr >= prochodnojBal);
        System.out.println("Сбылась ли мечта Пети?");
        System.out.println(poluchil);


    }
}
