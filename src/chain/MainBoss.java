package chain;

public class MainBoss implements SalaryHandler {
    private SalaryHandler handler;
    private String handlerName;

    public MainBoss(String name) {
        this.handlerName = name;
    }
    @Override
    public void setNext(SalaryHandler handler) {
        this.handler = handler;
    }

    @Override
    public void newWageOffer(Salary salary) {
        double increasePersentFromSalary = Math.round(((salary.getIncrease() * 100) / salary.getAmount()) * 100.0) / 100.0;
        if(increasePersentFromSalary > 5) {
            System.out.println(handlerName + " käsittelee palkankorotusta ja antaa päätöksen!");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
