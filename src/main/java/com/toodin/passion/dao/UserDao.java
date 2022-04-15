package com.toodin.passion.dao;

import com.toodin.passion.domain.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author kenzo
 * @date 2022-03-30 15:47
 */
public interface UserDao extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

    Boolean existsById();

    List<UserEntity> findTop10ByUsername(String username);

    List<UserEntity> getFirst10ByUsername(String username);

}
