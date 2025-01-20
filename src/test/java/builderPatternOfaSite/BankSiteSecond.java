package builderPatternOfaSite;

public class BankSiteSecond {
    public BankSite login()
    {
        System.out.println("login page");
        return new BankSite();
    }

    public BankSite CheckBalance()
    {
        System.out.println("check the a/c balance");
        return new BankSite();
    }
    public BankSite updateCustomerInfo()
    {
        System.out.println("update the customer info");
        return new BankSite();

    }
    public BankSite printStatement()
    {
        System.out.println("print monthly statement");
        return new BankSite();
    }

}
