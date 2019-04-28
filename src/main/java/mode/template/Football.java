package mode.template;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("准备进行足球游戏");
    }

    @Override
    void startPlay() {
        System.out.println("开始足球游戏");
    }

    @Override
    void endPlay() {
        System.out.println("结束足球游戏");
    }
}
