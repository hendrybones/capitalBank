package com.example.capitalcasebackend.repository;

import com.example.capitalcasebackend.model.security.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import javax.persistence.Entity;

@Repository
public interface RoleRepo  extends CrudRepository<Role,Long> {
    Role findByName(String name);
}
