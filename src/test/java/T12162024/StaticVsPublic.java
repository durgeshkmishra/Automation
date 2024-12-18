package T12162024;

public class StaticVsPublic {
    //static vs public method
    public static void myStaticMethod()
    {
        System.out.println("static method");
    }
    public void myPublicMethod()
    {
        System.out.println("public method");
    }

    public static void main(String[] args) {
        myStaticMethod(); //called static method without creating object
        StaticVsPublic myObj = new StaticVsPublic();
        myObj.myPublicMethod(); //called public method using class object
        Dispaly d1 = new Dispaly();
        d1.fName();
    }
}
class Dispaly{
    public void fName(){
        System.out.println("defiend 2nd class method called by  first class");
    }
}
