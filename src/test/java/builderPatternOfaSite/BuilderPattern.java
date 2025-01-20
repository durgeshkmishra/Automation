package builderPatternOfaSite;

public class BuilderPattern {
    public static void main(String[] args) {
        BankSite launch = new BankSite();
       // BankSiteSecond site = new BankSiteSecond();

//        launch.login();
//        launch.CheckBalance();
//        launch.updateCustomerInfo();
//        launch.printStatement();

        launch.login()
                .CheckBalance()
                .updateCustomerInfo()
                .printStatement();





    }
}
