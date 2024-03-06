/**
 * 单例模式
 * 1. 构造函数私有化  ---- 不允许外部创建对象
 */
public class User {

    //无论是否需要获取，在类加载时就创建一个实例
    private static final User USER = new User();

    private User(){

    }

    /**
     * 饿汉式
     * 即迫不及待的创建出对象
     */
    public static User getUser(){
        return USER;
    }

}