package com.hzb.photoalbum.repository;

import com.hzb.photoalbum.pojo.PUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name="p_user")
public interface UserRepository extends CrudRepository<PUser,String> {

    PUser findPUserByNameAndPassword(String name,String password);

    PUser findPUserById(String id);

}
