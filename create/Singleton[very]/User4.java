public class User4 {

    /**
     * java的静态内部类在被调用时才会加载
     * 1.静态内部类和外部类是独立的，不会随着外部类的加载而加载，这点和普通内部类不同
     * 2.静态内部类可以访问外部类的静态成员，包括私有静态成员
     */
    private static class User4Holder{
        private static final User4 USER_4 = new User4();
    }

    private User4(){

    }

    public static User4 getUser4(){
        return User4Holder.USER_4;
    }

}