package developer.api.config;

import developer.api.model.Developer;
import developer.api.model.WorkPlace;
import developer.api.repository.DeveloperRepository;
import developer.api.repository.WorkPlaceRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
@AllArgsConstructor
public class AppConfig {


    @Bean
    CommandLineRunner commandLineRunner(DeveloperRepository developerRepository, WorkPlaceRepository workPlaceRepository) {
        return args -> {

            Developer tomas = Developer.builder()
                    .name("tomas")
                    .seniority("mid")
                    .dob(LocalDate.parse("2019-05-06"))
                    .build();

            Developer karolis = Developer.builder()
                    .name("Karolis")
                    .seniority("junior")
                    .dob(LocalDate.parse("2021-07-01"))
                    .build();
            developerRepository.save(tomas);
            developerRepository.save(karolis);
            WorkPlace nortal = WorkPlace.builder()
                    .name("Nortal")
                    .address("Rinktines g.6 ")
                    .developer(tomas)
                    .build();

            WorkPlace senukai = WorkPlace.builder()
                    .name("Senukai")
                    .address("Ukmerges g.6 ")
                    .developer(tomas)
                    .build();


            workPlaceRepository.saveAll(Arrays.asList(nortal,senukai));

        };
    }
}