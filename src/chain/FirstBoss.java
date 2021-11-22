package chain;

public class FirstBoss implements SalaryHandler {
    private SalaryHandler handler;
    private String handlerName;

    public FirstBoss(String name) {
        this.handlerName = name;
    }
    @Override
    public void setNext(SalaryHandler next) {
        this.handler = next;
    }

    @Override
    public void newWageOffer(Salary salary) {
        double increasePersentFromSalary = Math.round(((salary.getIncrease() * 100) / salary.getAmount()) * 100.0) / 100.0;

        System.out.println("Pyyntö: " + increasePersentFromSalary + " prosenttia palkasta.");

        if(increasePersentFromSalary <= 2) {
            System.out.println(handlerName + " ratkaisee työntekijän palkankorotuspyynnön ja antaa päätöksen, " +
                    "koska pyyntö ei ollut isompi kun 2 % palkasta!");
        } else {
            if(handler != null) {
                System.out.println("Työntekijän pyyntö lähetetään eteenpäin, seuraava käsittelijä - " + handler.getHandlerName() +
                        ", koska pyyntö oli isompi kun 2 % palkasta!");
                handler.newWageOffer(salary);
            }
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
