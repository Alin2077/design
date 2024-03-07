import java.util.ArrayList;
import java.util.List;

interface Observe {
    void update(String message);
}

class Observe1 implements Observe {

    @Override
    public void update(String message) {
        System.out.println("Observe1 update :\t"+message);
    }

}

class Observe2 implements Observe {

    @Override
    public void update(String message) {
        System.out.println("Observe2 update :\t"+message);
    }

}

interface SubjectDemo {
    void registerObserve(Observe observe);
    void removeObserve(Observe observe);
    void notifyAllObserve(String message);
}

class SubjectD implements SubjectDemo {
    private final List<Observe> observes = new ArrayList<>();
    @Override
    public void registerObserve(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void removeObserve(Observe observe) {
        observes.remove(observe);
    }

    @Override
    public void notifyAllObserve(String message) {
        for (Observe observe : observes) {
            observe.update(message);
        }
    }
}

public class ObserveDemo {

    public static void main(String[] args) {
        SubjectD subjectD = new SubjectD();

        Observe1 observe1 = new Observe1();
        Observe2 observe2 = new Observe2();

        subjectD.registerObserve(observe1);
        subjectD.registerObserve(observe2);

        subjectD.notifyAllObserve("第一条消息");

        subjectD.removeObserve(observe1);

        subjectD.notifyAllObserve("第二条消息");
    }

}