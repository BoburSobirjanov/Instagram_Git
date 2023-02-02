package uz.pdp.Instagram.model;

public class User extends BaseModel {
    private String username;
    private String password;
    private String phoneNumber;
    private String fullName;
    private String Bio;
    private int follower;
    private int following;

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public User(String username, String password, String phoneNumber, String fullName, String bio, int follower, int following) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        Bio = bio;
        this.follower = follower;
        this.following = following;
    }

    public User(String username) {
        this.username = username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String phoneNumber, String fullName, String bio) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        Bio = bio;
    }

    public User(String username, String password, String phoneNumber, String fullName) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    public User(String mittime, String mittivine, String s) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }
}
