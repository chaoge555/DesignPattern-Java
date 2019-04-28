package reflex.field;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldOperation {
    public static void main(String[] args) throws Exception {
        Person person = new Person("luoxn28", 23);
        Class clazz = person.getClass();
        ClassLoader classLoader=  clazz.getClassLoader();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String key = field.getName();
            PropertyDescriptor descriptor = new PropertyDescriptor(key, Person.class);
            //读取
            System.out.println("直接读取：");
            Method methodByGet = descriptor.getReadMethod();
            Object value = methodByGet.invoke(person);
            System.out.println(key + ":" + value);
            //修改
            System.out.println("修改后读取读取：");
            Method methodBySet = descriptor.getWriteMethod();
            if ("name".equalsIgnoreCase(key)) {
                methodBySet.invoke(person, "张三");
                System.out.println(person.getName());
            } else {
                methodBySet.invoke(person, 15);
                System.out.println(person.getAge());
            }
        }
    }
}
