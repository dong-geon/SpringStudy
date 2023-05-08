// Abstract Class
public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String str);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    // 템플릿 메소드
    public String requestConnection(String str){
        // 보안 작업 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(str);
        // 반환된 것을 가지고 id과 password를 추출한다.
        String id = "aaa";
        String password = "bbb";

        // 인증
        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        // 권한
        String userName = "userName";
        int i = authorization(userName);

        switch (i){
            case 0: // 매니저
                break;
            case 1: // 유로회원
                break;
            case 2: // 무료회원
                break;
            case 3: // 권한없음
                break;
            default: // 기타상황
                break;
        }

        return connection(decodedInfo);
    }
}
