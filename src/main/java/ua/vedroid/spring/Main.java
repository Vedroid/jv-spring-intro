package ua.vedroid.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.vedroid.spring.config.AppConfig;
import ua.vedroid.spring.model.User;
import ua.vedroid.spring.service.UserService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(new User("Bob", "", "Bob@mail.com"));
        userService.add(new User("Alice", "", "Alice@mail.com"));
        userService.add(new User("Bruce", "", "Bruce@mail.com"));
        userService.add(new User("John", "", "John@mail.com"));

        System.out.println("All users:");
        userService.listUsers().forEach(System.out::println);
    }
}
