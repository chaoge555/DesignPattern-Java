package mode.singleton;

//线程安全，通过缩小加锁的范围提高效率
public class SingletonobjectSelectSynSafety {
    private static SingletonobjectSelectSynSafety instance;

    private SingletonobjectSelectSynSafety() {
    }

    public void output() {
        System.out.println("我是SingletonobjectSelectSynSafety,线程安全，通过缩小加锁的范围提高效率");
    }

    public static SingletonobjectSelectSynSafety getInstance() {
        if (instance == null) {
            synchronized (SingletonobjectSelectSynSafety.class) {
                if (instance == null) {
                    instance = new SingletonobjectSelectSynSafety();
                }
            }
        }
        return instance;
    }
}
