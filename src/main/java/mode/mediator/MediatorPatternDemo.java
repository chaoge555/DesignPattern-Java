package mode.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User userOne= new User("小明");
        User userTwo= new User("小李");

        userOne.sendMessage("小李，你好！");
        userTwo.sendMessage("小明，你好！");
    }
}
