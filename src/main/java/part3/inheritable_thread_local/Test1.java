package part3.inheritable_thread_local;

/**
 * @author hofey
 **/
public class Test1 {

    static class UserInfo{
        public String username;

        public UserInfo(String username) {
            this.username = username;
        }
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("我是旧值");
        UserInfo userInfo2 = userInfo;
        System.out.println(userInfo.username + " "+ userInfo2.username);
        userInfo.username= "我是新值";
        System.out.println(userInfo.username + " "+ userInfo2.username);
    }
}
