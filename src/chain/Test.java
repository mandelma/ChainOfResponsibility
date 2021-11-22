package chain;

public class Test {
    public static void main(String[] args) {
        Salary wage = null;
        FirstBoss firstBoss = new FirstBoss("Lähiesimies");
        SecondBoss secondBoss = new SecondBoss("Yksikkön päälikkö");
        MainBoss mainBoss = new MainBoss("Toimitusjohtaja");

        firstBoss.setNext(secondBoss);
        secondBoss.setNext(mainBoss);

        // palkka 1800 ja halutaan korotusta 30 euroa
        wage = new Salary(1800, 30);
        firstBoss.newWageOffer(wage);
        System.out.println("-------------------------");

        // palkka 2800 ja halutaan korotusta 100 euroa
        wage = new Salary(2800, 100);
        firstBoss.newWageOffer(wage);
        System.out.println("--------------------------");

        // palkka 3500 ja halutaan korotusta 300 euroa
        wage = new Salary(3500, 300);
        firstBoss.newWageOffer(wage);
    }
}
