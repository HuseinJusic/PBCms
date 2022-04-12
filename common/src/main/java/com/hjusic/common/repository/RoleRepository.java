package com.hjusic.common.repository;

import com.hjusic.common.model.user.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface RoleRepository extends MongoRepository<Role, UUID> {
}
