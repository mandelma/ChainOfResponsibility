package chain;

public class SecondBoss implements SalaryHandler {
    private SalaryHandler handler;

    private String handlerName;

    public SecondBoss(String name) {
        this.handlerName = name;
    }
    @Override
    public void setNext(SalaryHandler next) {
        this.handler = next;
    }

    @Override
    public void newWageOffer(Salary salary) {
        double increasePersentFromSalary = Math.round(((salary.getIncrease() * 100) / salary.getAmount()) * 100.0) / 100.0;
        if(increasePersentFromSalary > 2 && increasePersentFromSalary <= 5) {
            System.out.println(handlerName + " käsittelee palkankorotusta!");
        } else {
            if(handler != null) {
                System.out.println("Pyyntö lähetetään eteenpäin, seuraava käsittelijä - "
                        + handler.getHandlerName() + ", koska pyyntö oli isompi kun 5 % palkasta!");
                handler.newWageOffer(salary);
            }
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
