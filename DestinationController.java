package com.travelbharat.destination;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/api/destinations")
@CrossOrigin(origins = "*")
public class DestinationController {
    private final DestinationRepository repository;

    public DestinationController(DestinationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Destination> all() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Destination byId(@PathVariable Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Destination not found"));
    }

    @GetMapping("/state/{stateName}")
    public List<Destination> byState(@PathVariable String stateName) {
        return repository.findByStateNameIgnoreCaseOrderByNameAsc(stateName);
    }

    @GetMapping("/search")
    public List<Destination> search(@RequestParam String keyword) {
        if (keyword == null || keyword.isBlank()) return List.of();
        return repository
            .findByNameContainingIgnoreCaseOrStateNameContainingIgnoreCaseOrCategoryContainingIgnoreCase(
                keyword.trim(), keyword.trim(), keyword.trim());
    }
}
