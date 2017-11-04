package com.repository;

import com.common.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Nir on 9/29/2017.
 */
@Repository
public interface IRepository {
    User findByName(String username);
}
