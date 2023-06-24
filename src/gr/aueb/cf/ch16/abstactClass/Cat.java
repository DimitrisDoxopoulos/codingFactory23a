package gr.aueb.cf.ch16.abstactClass;

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Hello from Cat");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" Cat ate all her food");
    }

    @Override
    public String toString() {
        return getName() + " " + getName();
    }
}
