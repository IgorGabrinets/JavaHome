public class VaSVMagazine {
    public static void main(String[] args) {
        int cash = 1000;
        int cashAfterShop = 1000;
        System.out.println("Купил?");
        boolean kupil = (cashAfterShop < cash);
        System.out.println(kupil);
        System.out.println("Ничего не купил?");
        boolean nekupil =(cashAfterShop >= cash);
        System.out.println(nekupil);
    }
}
