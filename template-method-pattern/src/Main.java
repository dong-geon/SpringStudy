import donggeon.AbstGameConnectHelper;
import donggeon.DefaultGameConnectHelper;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();

        helper.requestConnection("id, password info");
    }
}
