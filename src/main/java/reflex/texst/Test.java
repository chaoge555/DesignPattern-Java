package reflex.texst;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Singer target = new Singer();
        System.out.println(">>>" + target);
        System.out.println("<<<" + target.getClass());
        ISinger proxy = (ISinger) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName());
                        if (args != null) {
                            System.out.println(proxy);
                            System.out.println(target);
                            System.out.println(args.toString());
                            System.out.println(method);
                        }
                        System.out.println("向观众问好");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("谢谢大家");
                        return returnValue;
                    }
                });
        proxy.sing();
        proxy.singS("xiao");
    }
}
