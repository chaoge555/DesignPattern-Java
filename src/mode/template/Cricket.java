package mode.template;

public  class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("准备进行板球游戏");
    }

    @Override
    void startPlay() {
        System.out.println("开始板球游戏");
    }

    @Override
    void endPlay() {
        System.out.println("结束板球游戏");
    }
}
