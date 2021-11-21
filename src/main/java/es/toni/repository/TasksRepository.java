package es.toni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.toni.model.Task;

public interface TasksRepository extends JpaRepository<Task, Long> {
    Task findByDescription(String description);
}
