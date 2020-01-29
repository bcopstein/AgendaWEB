package com.bcopstein.interfaces.WebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bcopstein"}) // onde procurar os componentes para injeção de dependência
@EnableJpaRepositories(basePackages = {"com.bcopstein"}) // onde procurar as interfaces dos repositórios do JPA
@EntityScan(basePackages = {"com.bcopstein"}) // onde procurar as entidades
public class AgendaWeb {
    public static void main(String args[]){
        SpringApplication.run(AgendaWeb.class,args);
    }
}