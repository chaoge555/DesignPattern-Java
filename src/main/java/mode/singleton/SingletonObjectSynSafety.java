package mode.singleton;

//线程安全，效率低下(方法加锁)
public class SingletonObjectSynSafety {
    private static SingletonObjectSynSafety instance;

    private SingletonObjectSynSafety() {
    }

    public void output() {
        System.out.println("我是SingletonObjectSynSafety,线程安全，效率低下(方法加锁)");
    }

    public static synchronized SingletonObjectSynSafety getInstance() {
        if (instance == null) {
            return new SingletonObjectSynSafety();

        }
        return instance;
    }
}
