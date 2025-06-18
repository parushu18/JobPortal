package com.codewithram.mystore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithram.mystore.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser,Integer > {

	 public AppUser findByEmail(String email);
}
