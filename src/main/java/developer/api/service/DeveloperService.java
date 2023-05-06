package developer.api.service;

import developer.api.model.Developer;
import developer.api.repository.DeveloperRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DeveloperService {

    private final DeveloperRepository developerRepository;

    public List<Developer> findAll() {
      return   developerRepository.findAll();
    }
}
