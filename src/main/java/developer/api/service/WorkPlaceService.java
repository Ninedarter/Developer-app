package developer.api.service;

import developer.api.model.WorkPlace;
import developer.api.repository.WorkPlaceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class WorkPlaceService {

    private final WorkPlaceRepository workPlaceRepository;

    public List<WorkPlace> findAll(){
        return   workPlaceRepository.findAll();

    }
}
