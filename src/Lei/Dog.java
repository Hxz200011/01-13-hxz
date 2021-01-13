package Lei;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName()+"汪汪叫");

    }
    @Override
    public void run() {

    }
}
