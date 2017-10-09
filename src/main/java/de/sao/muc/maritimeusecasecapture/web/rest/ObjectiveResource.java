package de.sao.muc.maritimeusecasecapture.web.rest;


import de.sao.muc.maritimeusecasecapture.model.ObjectiveEntity;
import de.sao.muc.maritimeusecasecapture.service.ObjectiveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/rest/hello")
@RestController
public class ObjectiveResource {

    private final ObjectiveService objectiveService;

    public ObjectiveResource(ObjectiveService objectiveService) {
        this.objectiveService = objectiveService;
    }


    @GetMapping("/api/objective/{id}")
    public ObjectiveEntity getObjective(@PathVariable int id) {
        return objectiveService.getObjective(id);
    }

}
