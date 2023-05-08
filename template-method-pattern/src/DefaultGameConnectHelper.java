// Concrete Class
public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String str) {
        System.out.println("decode");
        return "decode";
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("id, password check");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("authorization check");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("connection step");
        return null;
    }
}
