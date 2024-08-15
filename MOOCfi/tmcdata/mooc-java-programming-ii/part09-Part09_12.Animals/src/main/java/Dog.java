public class Dog extends Animal implements NoiseCapable {
    
    public Dog (String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(this.getName() + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }

    // public void sleep() {
    //     System.out.println(this.name + " sleeps");
    // }

    // public void eats() {
    //     System.out.println(this.name + " eats");
    // }
}
