package com.ty.employee.service;

 
import org.springframework.security.core.userdetails.UserDetailsService;

import com.ty.employee.model.User;
import com.ty.employee.web.dto.UserRegisterationDto;

public interface UserService extends UserDetailsService{
	 User save(UserRegisterationDto registerationdto);
}
