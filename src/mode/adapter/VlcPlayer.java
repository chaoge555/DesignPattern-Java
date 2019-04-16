package mode.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("正在播放的 vlc 文件名：" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
