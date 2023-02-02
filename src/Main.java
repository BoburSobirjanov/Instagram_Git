import uz.pdp.Instagram.model.User;
import uz.pdp.Instagram.repository.UserRepository;
import uz.pdp.Instagram.service.followersservice.FollowersService;
import uz.pdp.Instagram.service.followersservice.FollowersServiceImpl;
import uz.pdp.Instagram.service.postservice.PostService;
import uz.pdp.Instagram.service.postservice.PostServiceImpl;
import uz.pdp.Instagram.service.userservice.UserService;
import uz.pdp.Instagram.service.userservice.UserServiceImpl;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    static UserService userService = new UserServiceImpl();
    static PostService postService = new PostServiceImpl();
    static FollowersService followersService = new FollowersServiceImpl();

    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanStr = new Scanner(System.in);

    public static void main(String[] args) {
        defaultD();
        System.out.println("1-Sign up\t2-Sign In\t\t0.Exit");
        int act = scanInt.nextInt();
        while (true) {
            switch (act) {
                case 1 -> {
                    signUp();
                }
                case 2 -> {
                    signIn();
                }
                case 0 -> {
                    return;
                }
            }
        }
    }

    private static void signIn() {
        System.out.print("Enter username: ");
        String username = scanStr.nextLine();
        System.out.print("Enter password: ");
        String password = scanStr.nextLine();
        for (int i = 0; i < UserRepository.users.size(); i++) {
            if (password.equals(UserRepository.users.get(i).getPassword()) &&
                    username.equals(UserRepository.users.get(i).getUsername())){
                userMenu();
                break;
            }
            else {
                System.out.println("We did not find this user ❌");
                break;
            }
        }
    }

    private static void userMenu() {
        System.out.println("Hello");

    }

    private static void signUp() {
        System.out.println("Choose the type of signing up:");
        System.out.println("1-With Gmail\t\t2-With Phone number\t\t0-Back");
        int act1 = scanInt.nextInt();
        while (true){
            switch (act1) {
                case 1 -> gmailUp();
                case 2 -> phoneUp();
                case 0 -> {
                    return;
                }
            }
        }
    }


    private static void phoneUp() {
        System.out.print("Enter your phone number: ");
        String  phoneNumber=scanInt.nextLine();
        System.out.print("Enter your username: ");
        String username=scanStr.nextLine();
        System.out.print("Enter your password: ");
        String password=scanInt.nextLine();
        userService.add(new User(username,password,phoneNumber));

    }

    private static void gmailUp() {
        while(true){
            System.out.print("Enter your gmail:  ");
            String gmail=scanStr.nextLine();
            if (gmail.endsWith("@gmail.com")){System.out.print("Enter your username:  ");
                String username=scanStr.nextLine();
                for (int i = 0; i < UserRepository.users.size(); i++) {
                    if (UserRepository.users.get(i).getUsername().equals(username)){
                        System.out.println("This username has already used ❌");
                        return;
                    } else {
                        System.out.print("Create a password:  ");
                        String password=scanStr.nextLine();
                        if (password.length()>8){
                            userService.add(new User(username,password,gmail)); }
                        else {
                            System.out.println("Password length must be more 8 character !");
                            return;
                        }
                    } } }
            else {
                System.out.println("Wrong something. Try Again ❌" );
            }
        }}
    public static void defaultD(){
        userService.add(new User("dilime","dli1999","880007799"));
        userService.add(new User("mittime","mittivine","880007799"));
        userService.add(new User("cristiano","cr7family","880007799"));
    }
}