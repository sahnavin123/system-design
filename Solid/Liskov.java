package Solid;

// If class B is a subtype of class A, then we should be able to replace object of A with B without breaking the behaviour of the program

interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin is eating.");
    }
    // No fly method, so no violation
}
