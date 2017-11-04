package com.repository;

import com.common.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Nir on 8/4/2017.
 */
@Repository
public class UsersRepository implements IRepository{

    private Map<String, User> users = Stream.of(new String[] {"nir,12345678", "niro,87654321"}).map(s -> s.split(","))
            .map(s -> new User(s[0], s[1])).collect(Collectors.toMap(User::getUsername, Function.identity()));


    public User findByName(String username){
        return users.get(username);
    }

}
