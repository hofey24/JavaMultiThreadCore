package part7.t6_auto_add_group;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        //方法activeGroupCount()取得当前线程组对象中的子线程组数量
        //方法enumerate()的作用是将线程组中的子线程组以复制的形式存入ThreadGroup[]数组最对象中

        System.out.println(" A处线程： "+Thread.currentThread().getName()+" 所属线程组名为： " +
                Thread.currentThread().getThreadGroup().getName() +"中有线程组数量" +
                Thread.currentThread().getThreadGroup().activeGroupCount()
        );
        //自动加入到main组中
        ThreadGroup group = new ThreadGroup("新的组");
        System.out.println(" B处线程： " + Thread.currentThread().getName() + " 所属线程组名为： " +
                Thread.currentThread().getThreadGroup().getName() + "中有线程组数量" +
                Thread.currentThread().getThreadGroup().activeGroupCount()
        );

        ThreadGroup[] groupArray = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groupArray);
        for (int i = 0; i < groupArray.length; i++) {
            System.out.println("第" + i + "个线程组名为： " + groupArray[i].getName());
        }
    }
}

