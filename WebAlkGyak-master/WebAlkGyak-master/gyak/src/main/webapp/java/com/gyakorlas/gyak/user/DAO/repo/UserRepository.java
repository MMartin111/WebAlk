package com.gyakorlas.gyak.user.DAO.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyakorlas.gyak.user.businessLogic.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,String> {


}
