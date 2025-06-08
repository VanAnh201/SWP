package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    // Additional query methods can be defined here if needed
    
}
