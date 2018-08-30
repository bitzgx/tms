package com.terminal.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.terminal.tms.model.Tms;

@Repository
public interface TmsRepository extends JpaRepository <Tms, Long> {

}
