package com.mycompany.bluraystore;

import com.mycompany.bluraystore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.bluraystore.controller",
        "com.mycompany.bluraystore.service",
        "com.mycompany.bluraystore.repository.file"
})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController controller = context.getBean(MovieController.class);
        controller.addUsingConsole();

    }
}
