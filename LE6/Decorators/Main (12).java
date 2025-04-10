class Main
{
    public static void main(String args[]){
        Offering offering=new IceCream();
        offering=new Soda(offering);
        offering=new Gin(offering);
         System.out.println(offering.getName()+" "+offering.getPrice());
    }
}