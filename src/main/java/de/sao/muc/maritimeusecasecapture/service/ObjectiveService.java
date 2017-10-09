package de.sao.muc.maritimeusecasecapture.service;

import de.sao.muc.maritimeusecasecapture.model.ObjectiveEntity;
import de.sao.muc.maritimeusecasecapture.repositories.ObjectiveRepository;
import org.springframework.stereotype.Service;

@Service
public class ObjectiveService {

    private final ObjectiveRepository objectiveRepository;

    public ObjectiveService(ObjectiveRepository objectiveRepository) {
        this.objectiveRepository = objectiveRepository;
    }

    public ObjectiveEntity getObjective(int id) {
        return objectiveRepository.findOne(id);
    }
}
