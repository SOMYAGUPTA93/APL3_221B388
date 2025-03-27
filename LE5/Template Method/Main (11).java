class Main
{
    public static void main(String args[])
    {
        System.out.println("FOR WHISKY");
        Beverage b=new Whisky();    //runtime polymorphism (mother class variable and child class object)
        b.templateMethod(30);
         System.out.println("FOR BEER");
        b=new Beer();
        b.templateMethod(200);
    }
}

//protected access within the package and also in child class