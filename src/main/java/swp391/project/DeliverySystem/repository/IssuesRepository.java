package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.Issues;

public interface IssuesRepository extends JpaRepository<Issues, Long> {

    // Additional query methods can be defined here if needed
    
}
