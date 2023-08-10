package interfaceintro;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("bark");
    }

    @Override
    public void move() {
        System.out.println("Dog moving");
    }
}
