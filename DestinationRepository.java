package com.travelbharat.destination;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
    List<Destination> findByStateNameIgnoreCaseOrderByNameAsc(String stateName);
    List<Destination> findByNameContainingIgnoreCaseOrStateNameContainingIgnoreCaseOrCategoryContainingIgnoreCase(
        String name, String stateName, String category);
}
