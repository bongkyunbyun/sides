package com.kiosk.kiosk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiosk.kiosk.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long>{

}
