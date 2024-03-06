interface Coffee{
    String getDescription();
    double cost();
}

class CommonCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "common coffee";
    }

    @Override
    public double cost() {
        return 8.0;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}

class MilkDecoratedCoffee extends CoffeeDecorator {

    public MilkDecoratedCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 2.0;
    }
}

public class DecoratedDemo {
    public static void main(String[] args) {
        Coffee common = new CommonCoffee();
        System.out.println(common.getDescription()+"\tCost: $"+common.cost());

        Coffee milk = new MilkDecoratedCoffee(common);
        System.out.println(milk.getDescription()+"\tCost: $"+milk.cost());
    }
}