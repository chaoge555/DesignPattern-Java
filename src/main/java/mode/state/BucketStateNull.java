package mode.state;

public class BucketStateNull implements BucketState{
    @Override
    public void press() {
        System.out.println("没有水了");
    }
}
