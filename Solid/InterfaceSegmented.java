package Solid;
// Interface should be such, that client should not implement unnecessary functions the do not need.

interface WaiterInterface {
    void serveCustomers();

    void takeOrder();
}

interface ChefInterface {
    void cookFood();

    void decideMenue();
}

class Waiter implements WaiterInterface {
    public void serveCustomers() {
        System.out.println("serving the customer");
    }

    public void takeOrder() {
        System.out.println("taking order");
    }
}
