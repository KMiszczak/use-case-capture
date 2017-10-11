package de.sao.muc.maritimeusecasecapture.web.rest;

import de.sao.muc.maritimeusecasecapture.model.ProjectEntity;
import de.sao.muc.maritimeusecasecapture.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectResource {

    private final ProjectService projectService;

    public ProjectResource(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public List<ProjectEntity> getAllProjects() {
        return projectService.getAllProjects();
    }
}
