abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}

class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football init ...");
    }

    @Override
    void startPlay() {
        System.out.println("Football start ...");
    }

    @Override
    void endPlay() {
        System.out.println("Football end ...");
    }
}

class Car extends Game {

    @Override
    void initialize() {
        System.out.println("Car init ...");
    }

    @Override
    void startPlay() {
        System.out.println("Car start ...");
    }

    @Override
    void endPlay() {
        System.out.println("Car end ...");
    }
}

public class TemplateDemo {

    public static void main(String[] args) {
        Football football = new Football();
        football.play();

        Car car = new Car();
        car.play();
    }
}