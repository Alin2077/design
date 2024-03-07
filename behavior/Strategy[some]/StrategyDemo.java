interface Strategy {
    void execute();
}

class ConcreteStrategyA implements Strategy {

    @Override
    public void execute() {
        System.out.println("execute A ...");
    }

}

class ConcreteStrategyB implements Strategy {

    @Override
    public void execute() {
        System.out.println("execute B ...");
    }

}

class ConcreteStrategyC implements Strategy {

    @Override
    public void execute() {
        System.out.println("execute C ...");
    }

}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void play() {
        strategy.execute();
    }

}


public class StrategyDemo {

    public static void main(String[] args) {

        Context context = new Context(new ConcreteStrategyA());
        context.play();

        context.setStrategy(new ConcreteStrategyB());
        context.play();

        context.setStrategy(new ConcreteStrategyC());
        context.play();

    }

}