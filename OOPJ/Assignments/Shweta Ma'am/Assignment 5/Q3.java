class Animal  {
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public void eat(){
        System.out.println(name + "is eating");
    }
    public void sleep(){
        System.out.println(name + "is sleeping");
    }
    

}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void bark(){
        System.out.println(getName() +  "is barking");
    }
}
public class Q3 {
    public static void main(String[] args) {
        Animal A=new Animal("cat");
        A.eat();
        A.sleep();
        
        Dog d=new Dog("Kittu" );
        d.bark();
        d.eat();
        d.sleep();
    }

}
