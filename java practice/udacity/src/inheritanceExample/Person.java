package inheritanceExample;
public class Person{

    private String Name;
    private String Address;

    public Person(String Name, String Address){
        this.Name = Name;
        this.Address = Address;
    }
    
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void eat(String food){
        System.out.println(Name + " love eating " + food);
    }
    @Override
    public String toString() {
        return "Name: " + Name + " Location: " + Address;
    }
}





