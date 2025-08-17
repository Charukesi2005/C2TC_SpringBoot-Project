package com.tnif.onetoonemapping.controller.entity.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnif.onetoonemapping.controller.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}