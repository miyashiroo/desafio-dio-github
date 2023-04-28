package br.com.shiro.springdatabaseaula;

import br.com.shiro.springdatabaseaula.model.User;
import br.com.shiro.springdatabaseaula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp  implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
           User user = new User();
           user.setName("Shiro");
           user.setUsername("Shirao");
           user.setPassword("dale");

           repository.save(user);

        for (User u: repository.findAll()
             ) {
            System.out.println(u);

        }

    }
}

