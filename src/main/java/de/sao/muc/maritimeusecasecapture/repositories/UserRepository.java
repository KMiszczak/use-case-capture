package de.sao.muc.maritimeusecasecapture.repositories;

import de.sao.muc.maritimeusecasecapture.model.UserEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @EntityGraph(attributePaths = "roles")
    Optional<UserEntity> findOneWithRolesByNickname(String nickname);
    UserEntity findUserEntityByNickname(String nickname);
}
