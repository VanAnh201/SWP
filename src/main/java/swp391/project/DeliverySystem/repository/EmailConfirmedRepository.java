package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.EmailConfirmed;

public interface EmailConfirmedRepository extends JpaRepository<EmailConfirmed, Long> {
    
    // Additional query methods can be defined here if needed
    
}
