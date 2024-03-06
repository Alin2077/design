interface Subject{
    void use();
}

class CommonSubject implements Subject{

    @Override
    public void use() {
        System.out.println("common use");
    }
}

class ProxySubject implements Subject {

    private CommonSubject commonSubject;

    public ProxySubject(){
        commonSubject = new CommonSubject();
    }

    @Override
    public void use() {
        before();
        commonSubject.use();
        after();
    }

    private void before(){
        System.out.println("proxy before ...");
    }

    private void after(){
        System.out.println("proxy after ...");
    }
}

public class ProxyDemo {

    public static void main(String[] args) {
        new ProxySubject().use();
    }

}