package org.example.data.repo;

import org.example.data.models.Governorship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GovernorRepo extends JpaRepository<Governorship, Long> {
}
