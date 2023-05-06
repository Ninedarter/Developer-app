package developer.api.controller;


import developer.api.model.Developer;
import developer.api.model.WorkPlace;
import developer.api.repository.DeveloperRepository;
import developer.api.repository.WorkPlaceRepository;
import developer.api.service.DeveloperService;
import developer.api.service.WorkPlaceService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/developer")

public class DeveloperController {


    private final WorkPlaceService workPlaceService;
    private final DeveloperService developerService;

    @Value("${developer.app.name}") //pagal sita adresa is properties failo bus paimta reiksme
    private String applicationName;


    @GetMapping("/name")
    public String getAppName() {
        return applicationName;
    }

    public DeveloperController(WorkPlaceService workPlaceService, DeveloperService developerService) {
        this.workPlaceService = workPlaceService;
        this.developerService = developerService;
    }

//    @GetMapping("/companies/")
//    public List<WorkPlace> getAllCompanies(){
//      List<WorkPlace> allWorkPlaces = workPlaceService.f
//        return allWorkPlaces;
//    }
//
// }

    @GetMapping("/")
    @CrossOrigin
    public List<Developer> getDevelopers() {
        System.out.println("Endpoint was reached!");
        List<Developer> devs = developerService.findAll();
        return devs;
    }

}

