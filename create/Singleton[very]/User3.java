public class User3 {

    private static volatile User3 USER_3;

    private User3(){

    }

    public static User3 getUser3(){
        if(USER_3 == null){
            synchronized (User3.class){
                if(USER_3 == null){
                    USER_3 = new User3();
                }
            }
        }

        return USER_3;
    }

}