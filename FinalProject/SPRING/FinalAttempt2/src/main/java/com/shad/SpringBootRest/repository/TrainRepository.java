package com.shad.SpringBootRest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.shad.SpringBootRest.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
	
	Optional<List<Train>> findBySourceAndDestination(String source, String destination);

	

}
