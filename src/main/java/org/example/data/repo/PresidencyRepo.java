package org.example.data.repo;

import org.example.data.models.Presidency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresidencyRepo extends JpaRepository<Presidency, Long> {
}
