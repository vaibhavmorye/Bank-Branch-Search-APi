package com.fylebank.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fylebank.model.Branches;

@Repository
public interface BranchRepository extends JpaRepository<Branches, String> {
	
	Branches findByifsc(String ifsc);
	
	@Query(value="SELECT br.bank_id,  br.ifsc,  br.branch, br.address, br.city,  br.district,  br.state, b.name FROM banks b join branches br on b.id = br.bank_id where lower(b.name) = lower(:bank_name) AND lower(br.city) = lower(:bank_city)", nativeQuery=true)
	List<Object[]> findBranchesByCity(@Param("bank_name") String Bank_name, @Param("bank_city") String bank_city);
	
}
