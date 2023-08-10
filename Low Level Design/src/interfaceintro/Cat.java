package interfaceintro;

public class Cat implements  Animal{
    @Override
    public void speak(){
        System.out.println("meu... meu");
    }

    @Override
    public void move() {
        System.out.println("Cat Walking");
    }

}
