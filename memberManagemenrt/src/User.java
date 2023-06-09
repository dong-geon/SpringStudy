
public class User {
    private String userId;
    private String userPwd;
    private String userName;
    private String birth;
    private String address;

    // 생성자
    public User() {
    }

    public User(String userId, String userPwd, String userName, String birth , String address) {
        super();
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.birth = birth;
        this.address = address;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getBirth() {
        return birth;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", address=" + address + "]";
    }
}