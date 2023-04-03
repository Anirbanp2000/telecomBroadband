package com.stl.telecombroadband.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stl.telecombroadband.entity.Plans;

public interface PlanRepo  extends JpaRepository<Plans, Long>{

}
