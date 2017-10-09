package de.sao.muc.maritimeusecasecapture.security;

import de.sao.muc.maritimeusecasecapture.model.UserEntity;
import de.sao.muc.maritimeusecasecapture.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DomainUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public DomainUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String nickname) throws UsernameNotFoundException {
        String lowerCaseNickname = nickname.toLowerCase();
        Optional<UserEntity> userFromDatabase = userRepository.findOneWithRolesByNickname(lowerCaseNickname);

        return userFromDatabase.map(userEntity -> new SecurityUserDetails(userEntity))
                .orElseThrow(() -> new UsernameNotFoundException("Nickname not fround."));
    }
}
