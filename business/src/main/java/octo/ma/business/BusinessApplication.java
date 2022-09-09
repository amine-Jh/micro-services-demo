package octo.ma.business;

import octo.ma.business.model.Pojo;
import octo.ma.business.repository.PojoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class BusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PojoRepository pojoRepository){
        return args-> {
            Stream.of("octo", "awb", "ywd").forEach(po -> {
                int i=0;
            pojoRepository.save(new Pojo(i+2L,"eeee","dkdkkdkd"));
            pojoRepository.findAll().forEach(item-> System.out.println(item.toString()) );
        });
        };
    }
}
