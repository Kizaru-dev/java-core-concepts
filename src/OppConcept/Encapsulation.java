package OppConcept;

class User{
    private int age ;
    public void setAge(int age){
        if(age > 0) this.age = age ;
    }
    public int getAge(){
        return age ;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(123);
        System.out.println(user.getAge());
    }

}
