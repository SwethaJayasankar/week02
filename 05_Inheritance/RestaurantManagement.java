class Person{
    private String name;
    private int id;
    public Person(String name,int id){
        this.name = name;
        this.id = id ;
    }
    public String getId(){
        return this.name;
    } public int getAge(){
        return this.id;
    }
}

interface Worker{
    public void performDuties();
}

class Chef extends Person implements Worker{
    public Chef(String name,int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Role of chef is to cook yummy and tasty food. :) ");
    }
}
class Waiter extends Person implements Worker{
    public Waiter(String name,int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Role of waiter is to serve yummy and tasty food in a reasonable time :) ");
    }
}

public class RestaurantManagement{
    public static void main(String[] args){
        Waiter w = new Waiter("Raju",43);
        Chef c = new Chef("Susheel",687);
        w.performDuties();
        c.performDuties();
    }


}