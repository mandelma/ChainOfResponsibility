package chain;

public interface SalaryHandler {
    public void setNext(SalaryHandler handler);
    public void newWageOffer(Salary salary);
    public String getHandlerName();
}
