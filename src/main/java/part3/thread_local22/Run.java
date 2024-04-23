package part3.thread_local22;

/**
 * @author hofey
 **/
public class Run {
    public static ThreadLocalExt tl = new ThreadLocalExt();
    public static void main(String[] args) {

        if(tl.get()==null){
            System.out.println("从未放过只");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());

    }
}
