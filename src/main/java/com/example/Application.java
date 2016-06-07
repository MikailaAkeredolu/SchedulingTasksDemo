package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * Created by mikailaakeredolu on 6/7/16.
 */
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class);
    }
}

/*
@EnableScheduling ensures that a background task executor is created. Without it, nothing gets scheduled.
 */

/*
@SpringBootApplication is a convenience annotation that adds all of the following:
@Configuration tags the class as a source of bean definitions for the application context.
@EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings,
 other beans, and various property settings. Technically, Spring Boot doesn’t have anything to auto-configure
 when it comes to scheduling but a future version might.
@ComponentScan tells Spring to look for other components, configurations, and services
in the the hello package, allowing it to find the ScheduledTasks.
 */