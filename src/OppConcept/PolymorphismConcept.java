package OppConcept;

class Animal{
    public  void sound(){

    };
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Bar Bar Bar Bar .....");
    }
}


public class PolymorphismConcept {
    public static void main(String[] args) {
        // meaning : Same method name , different behaviour . // Compile time polymorphism (method overloading ) .
        //
        Animal animal = new Dog();
        animal.sound();
    }

}
