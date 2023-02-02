package uz.pdp.Instagram.model;

public class Followers extends User{
    private String username;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    public Followers(String username, String password, String phoneNumber, String fullName, String bio, int follower, int following, String username1, Long userId, int followers, int following1) {
        super(username, password, phoneNumber, fullName, bio, follower, following);
        this.username = username1;
        this.userId = userId;
        this.followers = followers;
        this.following = following1;
    }

    private Long userId;
private int followers;
private int following;

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    @Override
    public int getFollowing() {
        return following;
    }

    @Override
    public void setFollowing(int following) {
        this.following = following;
    }

    public Followers(String username, String password, String phoneNumber, String fullName, String bio, int follower, int following, Long userId, int followers, int following1) {
        super(username, password, phoneNumber, fullName, bio, follower, following);
        this.userId = userId;
        this.followers = followers;
        this.following = following1;
    }

    public Followers(String username, Long userId, int followers, int following) {
        super(username);
        this.userId = userId;
        this.followers = followers;
        this.following = following;
    }

    public Followers(String username, String password, Long userId, int followers, int following) {
        super(username, password);
        this.userId = userId;
        this.followers = followers;
        this.following = following;
    }

    public Followers(String username, String password, String phoneNumber, String fullName, String bio, Long userId, int followers, int following) {
        super(username, password, phoneNumber, fullName, bio);
        this.userId = userId;
        this.followers = followers;
        this.following = following;
    }

    public Followers(String username, String password, String phoneNumber, String fullName, Long userId, int followers, int following) {
        super(username, password, phoneNumber, fullName);
        this.userId = userId;
        this.followers = followers;
        this.following = following;
    }

    public Followers(String mittime, String mittivine, String s, Long userId, int followers, int following) {
        super(mittime, mittivine, s);
        this.userId = userId;
        this.followers = followers;
        this.following = following;
    }

    public Followers(String username, String password, String phoneNumber, String fullName, String bio, String username1, Long userId, int followers, int following) {
        super(username, password, phoneNumber, fullName, bio);
        this.username = username1;
        this.userId = userId;
        this.followers = followers;
        this.following = following;
    }

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

    @Override
    public String toString() {
        return
                "Username = " + username + "  ||  " +
                "UserId = " + userId +"  ||  " +
                "Followers = " + followers +"  ||  " +
                "Following = " + following;
    }
}
