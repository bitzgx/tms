package com.terminal.tms.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.terminal.tms.model.Tms;

@Repository
public interface TmsRepository extends JpaRepository <Tms, Long> {
//	List<Tms> findByTmsId(Long tmsId);
}
