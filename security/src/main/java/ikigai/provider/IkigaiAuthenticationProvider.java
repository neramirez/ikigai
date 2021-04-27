package ikigai.provider;

import ikigai.entity.Admin;
import ikigai.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class IkigaiAuthenticationProvider extends DaoAuthenticationProvider {

    @Autowired
    public IkigaiAuthenticationProvider(@Qualifier("getPasswordEncoder") PasswordEncoder encoder, @Qualifier("ikigaiUserDetailsService") UserDetailsService userDetailsService) {
        super();
        super.setPasswordEncoder(encoder);
        super.setUserDetailsService(userDetailsService);
}

    @Autowired
    private AdminRepository adminRepository;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Admin user = adminRepository.findByEmail(authentication.getName()).orElseThrow();
        return super.authenticate(authentication);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(
                UsernamePasswordAuthenticationToken.class);
    }
}
