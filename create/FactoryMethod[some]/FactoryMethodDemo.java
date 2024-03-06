interface Product{
     void use();
}

class ProductA implements Product{
     public void use(){
        System.out.println("productA use ...");
    }
}

class ProductB implements Product{
     public void use(){
        System.out.println("productB use ...");
    }
}

interface Factory{
    Product getProduct();
}

class FactoryA implements Factory{
    public Product getProduct(){
        return new ProductA();
    }
}

class FactoryB implements Factory{
    public Product getProduct(){
        return new ProductB();
    }
}


public class FactoryMethodDemo {

    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.getProduct();
        productA.use();

        Factory factoryB = new FactoryB();
        Product productB = factoryB.getProduct();
        productB.use();
    }

}