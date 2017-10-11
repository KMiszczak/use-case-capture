package de.sao.muc.maritimeusecasecapture.service;

import de.sao.muc.maritimeusecasecapture.model.ProjectEntity;
import de.sao.muc.maritimeusecasecapture.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectEntity> getAllProjects() {
        List<ProjectEntity> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects::add);
        return projects;
    }
}
