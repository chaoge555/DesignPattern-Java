package mode.singleton;

//单例模式最好的一种方式
public enum SingletonObjectEnumSafety {
    INSTANCE;

    public void output() {
        System.out.println("我是SingletonObjectEnumSafety,单例模式最好的一种方式");
    }
}
