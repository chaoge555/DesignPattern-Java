package mode.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("刘海云", "CEO", 30000);
        Employee headSales = new Employee("李国仁", "销售领队", 15000);
        Employee headMarketing = new Employee("张云", "店长", 15000);
        Employee clerkOne = new Employee("小明", "店员", 8000);
        Employee clerkTwo = new Employee("小李", "店员", 8000);
        Employee salesExecutiveOne = new Employee("大状", "销售员", 80000);
        Employee salesExecutiveTwo = new Employee("大雄", "销售员", 80000);

        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutiveOne);
        headSales.add(salesExecutiveTwo);
        headMarketing.add(clerkOne);
        headMarketing.add(clerkTwo);

        System.out.println(CEO.toString());
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee.toString());
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee.toString());
            }
        }
    }
}
