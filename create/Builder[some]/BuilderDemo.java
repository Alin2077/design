class Chicken{

    private final String chickenName;

    private final String sauces;

    private final String snack;

    private Chicken(Builder builder){
        this.chickenName = builder.chickenName;
        this.sauces = builder.sauces;
        this.snack = builder.snack;
    }

    public static class Builder{

        private String chickenName;

        private String sauces;

        private String snack;

        public Builder setName(String name){
            this.chickenName = name;
            return this;
        }

        public Builder setSauces(String sauces){
            this.sauces = sauces;
            return this;
        }

        public Builder setSnack(String snack){
            this.snack = snack;
            return this;
        }

        public Chicken builder(){
            return new Chicken(this);
        }

    }

    @Override
    public String toString() {
        return "Chicken{" +
                "chickenName='" + chickenName + '\'' +
                ", sauces='" + sauces + '\'' +
                ", snack='" + snack + '\'' +
                '}';
    }
}

public class BuilderDemo {

    public static void main(String[] args) {

        Chicken builder = new Chicken.Builder().setName("鸡翅根").setSauces("蒜香酱油")
                .setSnack("地瓜丸").builder();
        System.out.println("builder = " + builder);

    }

}
