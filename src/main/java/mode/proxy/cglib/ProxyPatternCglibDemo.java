package mode.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyPatternCglibDemo {
    public static void main(String[] args) {
        Singer singer = new Singer();
        System.out.println(">>>>>>>>>>>>不要代理类：<<<<<<<<<<<<<");
        singer.sing();

        Singer proxy = (Singer) new ProxyFactory(singer).getProxyInstance();
        System.out.println(">>>>>>>>>>>>>使用代理类之后：<<<<<<<<<<<<");
        proxy.sing();
    }
}
