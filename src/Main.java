import uz.pdp.Instagram.model.User;
import uz.pdp.Instagram.repository.UserRepository;
import uz.pdp.Instagram.service.followersservice.FollowersService;
import uz.pdp.Instagram.service.followersservice.FollowersServiceImpl;
import uz.pdp.Instagram.service.postservice.PostService;
import uz.pdp.Instagram.service.postservice.PostServiceImpl;
import uz.pdp.Instagram.service.userservice.UserService;
import uz.pdp.Instagram.service.userservice.UserServiceImpl;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
public class Main {
    static Random random= new Random();
    static UserService userService = new UserServiceImpl();
    static PostService postService = new PostServiceImpl();
    static FollowersService followersService = new FollowersServiceImpl();
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanStr = new Scanner(System.in);
    public static void main(String[] args) {
        defaultD();
        while (true){
        System.out.println("1-Sign up\t\t2-Sign In\t\t0.Exit");
        int act = scanInt.nextInt();
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
        User user = userService.signIn(username,password);
            if (user!=null && user.getUsername().equals(username) && user.getPassword().equals(password)){
                userMenu();    }
            else {
                System.out.println("\nWe did not find this user ❌\n");
            }
    }

    private static void userMenu() {
        System.out.println("Hello");
    }

    private static void signUp() {
        while (true){
        System.out.println("Choose the type of signing up:");
        System.out.println("1-With Gmail\t\t2-With Phone number\t\t0-Back");
            switch (scanInt.nextInt()) {
                case 1 -> {
                    gmailUp();
                }
                case 2 -> {
                    phoneUp();
                }
                case 0 -> {
                    return;
                }
            }
        }
      }


    private static void phoneUp() {
        System.out.print("Enter username: ");
        String username = scanStr.nextLine();
        for (User user1: UserRepository.users) {
        if (user1.getUsername().equals(username)){
            System.out.println("\nThis username has already used ❌\n");
            return;
        }
        else {
        System.out.print("Enter phone number: (+998) ");
        String phoneNumber = scanStr.nextLine();
        if (phoneNumber.length()==9){
            while (true){
                int randomNum = random.nextInt(1000,9999);
                System.out.println("Your SMS code: " + randomNum);
                System.out.print("Enter SMS code: ");
                int smscode= scanInt.nextInt();
                if (smscode==randomNum){
                    System.out.println("SMS ✅");
                    break;
                }
                else {
                    System.out.println("Incorrect SMS code ❌");
                }
            }
            System.out.print("Enter your own password: ");
            String password= scanStr.nextLine();
            if (password.length()>=8){
            User user = new User(username,phoneNumber,password);
            userService.add(user);
            System.out.println("Sign Up Successfully ✅");
        } else {
                System.out.println("Password length must be more 8 character ❗");
            }
        }
        else {
            System.out.println("Phone Number is Wrong !  Try Again !");
        }
      }
        }
    }

    private static void gmailUp() {
        while(true){
            System.out.print("Enter your gmail:  ");
            String gmail=scanStr.nextLine();
            if (gmail.endsWith("@gmail.com")){
                System.out.print("Enter your username:  ");
                String username=scanStr.nextLine();
                for (User user: UserRepository.users) {
                    if (user.getUsername().equals(username)){
                        System.out.println("\nThis username has already used ❌\n");
                        return;
                    } else {
                        System.out.print("Create a password:  ");
                        String password=scanStr.nextLine();
                        if (password.length()>8){
                            userService.add(new User(username,password,gmail));
                            System.out.println("Sign Up Successfully ✅");
                        }
                        else {
                            System.out.println("Password length must be more 8 character ❗");
                            return;
                        }
                    } } }
            else {
                System.out.println("\nWrong something. Try Again ❌\n" );
            }
        }
    }
    public static void defaultD(){
        userService.add(new User("hgghghjh","dli1999"));
        userService.add(new User("mittime","mittivine"));
        userService.add(new User("cristiano","cr7family"));
            }
        }