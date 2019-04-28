package reflex.texst;

public class Singer implements ISinger {
    @Override
    public void sing() {
        System.out.println("唱一首歌");
    }

    @Override
    public void singS(String name) {
        System.out.println(name+"唱歌加跳舞");
    }
}
