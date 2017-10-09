package de.sao.muc.maritimeusecasecapture.repositories;

import de.sao.muc.maritimeusecasecapture.model.ObjectiveEntity;
import de.sao.muc.maritimeusecasecapture.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ObjectiveRepository extends JpaRepository<ObjectiveEntity, Integer> {

}
