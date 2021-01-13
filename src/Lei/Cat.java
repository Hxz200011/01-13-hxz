package Lei;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName()+":喵喵叫");

    }

    @Override
    public void run() {
       System.out.println(getName()+":我正在跑");

    }


}
