package builderPatternOfaSite;

public class BankSite {
    public BankSite login()
    {
        System.out.println("login page");
       // return new BankSite();
        return this;
    }
    public BankSite CheckBalance()
    {
        System.out.println("check the a/c balance");
        //return new BankSite();
        return this;
    }
    public BankSite updateCustomerInfo()
    {
        System.out.println("update the customer info");
       // return new BankSite();
        return this;

    }
    public BankSite printStatement()
    {
        System.out.println("print monthly statement");
        //return new BankSite();
        return this;
    }

}
