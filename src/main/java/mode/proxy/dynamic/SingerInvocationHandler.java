package mode.proxy.dynamic;

import mode.proxy.Sing;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class SingerInvocationHandler implements InvocationHandler {
    private Object object;

    public SingerInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在：" + new Date() + "时开始");
        Object invoke = method.invoke(object, args);
        System.out.println("在：" + new Date() + "时结束");
        return invoke;
    }
}
