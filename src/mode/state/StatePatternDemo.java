package mode.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        WaterDispenser waterDispenser =new WaterDispenser(new BucketStateFull());
        for(int i=0;i<5;i++){
            waterDispenser.press();
        }
    }
}
