package id.ac.upiyai.studentconsultationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentConsultationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentConsultationServiceApplication.class, args);
    }

}
