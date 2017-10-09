package login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import login.manager.UserManager;

@SpringBootApplication
public class Application {

	@Autowired
	private static UserManager userManager;
	
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
        //UserManagerImpl userManagerImpl = new UserManagerImpl();
        //userManagerImpl.createUser("roshan", "password", "USER");
//        User roshan = userManager.createUser("roshan", "password", "USER");
//        System.out.println(roshan.getUsername() + " saved!");
//        User rajan = userManager.createUser("rajan", "password", "USER");
//        System.out.println(rajan.getUsername() + "saved!");
    }
}
