package mode.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("吃饭中");
        originator.setState("睡觉中");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("游泳中");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("旅游中");

        System.out.println("当前状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("第一次保存的状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("第二次保存的状态: " + originator.getState());
    }
}
