package uz.pdp.Instagram.model;

public class Followers extends User{
private Long userId;

    public Followers(String username, String password, String phoneNumber, String fullName, String bio, Long userId) {
        super(username, password, phoneNumber, fullName, bio);
        this.userId = userId;
    }

    public Followers(String username, String password, String phoneNumber, String fullName, Long userId) {
        super(username, password, phoneNumber, fullName);
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
