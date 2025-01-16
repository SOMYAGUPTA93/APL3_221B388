public class Main
{
    int age;
    String name;
    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
public static void main(String[] args) {
   Main ob=new Main();
   ob.setAge(20);
   ob.setName("RADHA");
   System.out.println(ob.getName()+" "+ob.getAge());
}
}
