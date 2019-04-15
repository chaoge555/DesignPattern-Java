package mode.singleton;

//效率高，非线程安全,懒汉模式
public class SingletonObjectNonSafety {
    private static SingletonObjectNonSafety instance;

    private SingletonObjectNonSafety() {
    }

    public void output() {
        System.out.println("我是SingletonObjectNonSafety,效率高，非线程安全");
    }

    public static SingletonObjectNonSafety getInstance() {
        if (instance == null) {
            return new SingletonObjectNonSafety();
        }
        return instance;
    }
}
