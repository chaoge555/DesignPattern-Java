package mode.command;

public class Stock {
    private String name ="XXX股票";
    private int quantity =100;

    public void buy(){
        System.out.println("买进"+name+quantity+"股");
    }

    public void sell(){
        System.out.println("卖出"+name+quantity+"股");
    }
}
