package com.serviecs;

import com.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * Created by Nir on 8/4/2017.
 */
@Service
public class UsersService implements UserDetailsService {

    private final IRepository repository;

    @Autowired
    public UsersService(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByName(username);
    }
}
