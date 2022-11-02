public class Vasilij {
    public static void main(String[] args) {
        //Вася получает зарплату в 5.6 евро в час. Он работает 12 часов в день,
        // у него нет выходных, кроме 31 декабря. Он работает 364 дня в году.
        //Сколько часов отработает Вася за год и сколько он заработает денег.
        double stavkaVChas;
        stavkaVChas = 5.6;
        int kolvoChasovVDen;
        kolvoChasovVDen = 12;
            int kolvoRabDnejVGod;
        kolvoRabDnejVGod = 364;
        double ItogoZpVasilija;
            int otpuskDnej;
        otpuskDnej = 14;
        double stavkaOtpusk;
        stavkaOtpusk = 0.5;
        double zpOtpusk;
        zpOtpusk = otpuskDnej * kolvoChasovVDen * stavkaOtpusk * stavkaVChas;

        ItogoZpVasilija = kolvoChasovVDen * kolvoRabDnejVGod * stavkaVChas;
        System.out.println("Ответ на вопрос, сколько часов отработал Василий, если он конечно не помер");
        System.out.println(kolvoChasovVDen * kolvoRabDnejVGod);
        System.out.println("Ответ на вопрос, сколько денег заработал Василий");
        System.out.println(ItogoZpVasilija);
        System.out.println("Ответ на вопрос, сколько денег заработал Василий c учетом отпуска");
        System.out.println(ItogoZpVasilija - zpOtpusk);

    }
}
