package com.ty.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.employee.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//findbyemail
	User   findByEmail(String email);
}
