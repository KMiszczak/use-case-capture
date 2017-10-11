package de.sao.muc.maritimeusecasecapture.repositories;

import de.sao.muc.maritimeusecasecapture.model.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {

}
