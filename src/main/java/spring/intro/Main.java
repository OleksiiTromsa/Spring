package spring.intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.intro.config.AppConfig;
import spring.intro.model.User;
import spring.intro.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User bob = new User();
        bob.setFirstName("Bob");
        User alisa = new User();
        alisa.setFirstName("Alisa");
        userService.add(bob);
        userService.add(alisa);
        userService.listUsers().forEach(System.out::println);
    }
}
