package donggeon;

// Concrete Class
public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String str) {
        System.out.println("use upgrade decode");
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
        // 셧다운제 적용 (성인 및 시간 확인)
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("connection step");
        return null;
    }
}
