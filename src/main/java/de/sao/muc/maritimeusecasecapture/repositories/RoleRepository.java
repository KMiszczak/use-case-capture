package de.sao.muc.maritimeusecasecapture.repositories;

import de.sao.muc.maritimeusecasecapture.model.RoleEntity;
import de.sao.muc.maritimeusecasecapture.model.UserEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RoleRepository extends JpaRepository<RoleEntity, String> {
}
