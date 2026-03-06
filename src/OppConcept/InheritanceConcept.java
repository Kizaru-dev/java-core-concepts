package OppConcept;

class Engine {
    public void starter() {
        System.out.println("The Engines is started . ... ");
    }
}

class Cars extends Engine{
    @Override
    public void starter(){
        System.out.println("The Car has been started .. ..");
    }

}

public class InheritanceConcept {
    public static void main(String[] args) {
        // One class gets properties / behaviours / methods from another class .
        // code reuse , better structure , is-a relationship .

        Engine engine = new Cars();
        engine.starter();
    }
}
