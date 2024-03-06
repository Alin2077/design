interface Target{
    void use();
}

class Adaptee {
    public void request(){
        System.out.println("Adaptee request ...");
    }
}

class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void use() {
        adaptee.request();
    }
}

public class AdapterDemo {

    public static void main(String[] args) {

        Target target = new Adapter(new Adaptee());
        target.use();

    }

}