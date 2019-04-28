package mode.proxy.statics;

import mode.proxy.Sing;
import mode.proxy.Singer;

import java.util.Date;

public class SingerProxy implements Sing {
    private Sing singer;

    public SingerProxy(Singer singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        System.out.println("在：" + new Date() + "时开始");
        singer.sing();
        System.out.println("在：" + new Date() + "时结束");
    }
}
