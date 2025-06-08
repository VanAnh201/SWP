package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.Label;

public interface LabelRepository extends JpaRepository<Label, Long> {

    // Additional query methods can be defined here if needed
    
}
