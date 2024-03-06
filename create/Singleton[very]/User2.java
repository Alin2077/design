public class User2 {

    private static  User2 USER_2 = null;

    private User2(){

    }

    /**
     * 利用synchronized同步方法来达到并发安全的目的
     * 开销大
     * @return
     */
    public static synchronized User2 getUser2(){
        if(USER_2 == null){
            USER_2 = new User2();
        }

        return USER_2;
    }

}