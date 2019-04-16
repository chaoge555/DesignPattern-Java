package mode.state;

public class BucketStateFull implements BucketState{
    @Override
    public void press() {
        System.out.println("正在倒水");
    }
}
