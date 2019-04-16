package mode.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "如果没有如果");
        audioPlayer.play("mp4", "黑名单");
        audioPlayer.play("avi", "小鬼当家");
    }
}
