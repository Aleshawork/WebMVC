package com.alexey.web;

import com.alexey.web.DAO.Person;
import com.alexey.web.DAO.PersonServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.alexey.web")
public class WebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WebApplication.class);
        PersonServiceImpl p =context.getBean(PersonServiceImpl.class);
        List<Person> persons = p.findAll();
        for(Person per:persons){
            System.out.println(per);
        }


    }

}
