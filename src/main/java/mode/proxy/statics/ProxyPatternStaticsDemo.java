package mode.proxy.statics;

import mode.proxy.Sing;
import mode.proxy.Singer;

public class ProxyPatternStaticsDemo {
    public static void main(String[] args) {
        Sing singer =new Singer();
        System.out.println(">>>>>>>>>>>>不要代理类：<<<<<<<<<<<<<");
        singer.sing();

        Sing singerProxy =new SingerProxy(new Singer());
        System.out.println(">>>>>>>>>>>>>使用代理类之后：<<<<<<<<<<<<");
        singerProxy.sing();
    }
}
