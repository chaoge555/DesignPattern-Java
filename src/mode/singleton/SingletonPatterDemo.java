package mode.singleton;

public class SingletonPatterDemo {
    public static void main(String[] args) {
        SingletonObjectEnumSafety singletonObjectEnumSafety = SingletonObjectEnumSafety.INSTANCE;
        singletonObjectEnumSafety.output();

        SingletonObjectNonSafety singletonObjectNonSafety = SingletonObjectNonSafety.getInstance();
        singletonObjectNonSafety.output();

        SingletonObjectSafety singletonObjectSafety = SingletonObjectSafety.getInstance();
        singletonObjectSafety.output();

        SingletonObjectSynSafety singletonObjectSynSafety = SingletonObjectSynSafety.getInstance();
        singletonObjectSynSafety.output();

        SingletonobjectSelectSynSafety singletonobjectSelectSynSafety = SingletonobjectSelectSynSafety.getInstance();
        singletonobjectSelectSynSafety.output();
    }

}
