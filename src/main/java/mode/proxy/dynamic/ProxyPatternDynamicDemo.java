package mode.proxy.dynamic;

import mode.proxy.Sing;
import mode.proxy.Singer;

import java.lang.reflect.Proxy;

public class ProxyPatternDynamicDemo {
    public static void main(String[] args) {
        Sing singer = new Singer();
        System.out.println(">>>>>>>>>>>>不要代理类：<<<<<<<<<<<<<");
        singer.sing();

        SingerInvocationHandler singerInvocationHandler = new SingerInvocationHandler(singer);
        Sing proxy = (Sing) Proxy.newProxyInstance(singer.getClass().getClassLoader()
                , singer.getClass().getInterfaces(), singerInvocationHandler);
        System.out.println(">>>>>>>>>>>>>使用代理类之后：<<<<<<<<<<<<");
        proxy.sing();

    }
}
