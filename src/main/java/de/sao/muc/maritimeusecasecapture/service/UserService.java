package de.sao.muc.maritimeusecasecapture.service;

import de.sao.muc.maritimeusecasecapture.model.RoleEntity;
import de.sao.muc.maritimeusecasecapture.model.UserEntity;
import de.sao.muc.maritimeusecasecapture.repositories.RoleRepository;
import de.sao.muc.maritimeusecasecapture.repositories.UserRepository;
import de.sao.muc.maritimeusecasecapture.security.RolesConstants;
import de.sao.muc.maritimeusecasecapture.web.dto.RegisterUserDto;
import de.sao.muc.maritimeusecasecapture.web.dto.UserDto;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

    public boolean register(RegisterUserDto registerUserDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setNickname(registerUserDto.getNickname());
        userEntity.setFirstname(registerUserDto.getFirstname());
        userEntity.setLastname(registerUserDto.getLastname());
        userEntity.setPassword(passwordEncoder.encode(registerUserDto.getPassword()));

        //Gibt User eine Rolle
        Set<RoleEntity> roles = new HashSet<>();
        RoleEntity roleEntity = roleRepository.findOne(RolesConstants.USER);
        roles.add(roleEntity);
        userEntity.setRoles(roles);
        return userRepository.save(userEntity) != null;
    }

    public UserEntity findByNickname(String nickname) {
        return userRepository.findUserEntityByNickname(nickname);
    }

    public UserEntity getUser(int id) {
        return userRepository.findOne(id);
    }
}
