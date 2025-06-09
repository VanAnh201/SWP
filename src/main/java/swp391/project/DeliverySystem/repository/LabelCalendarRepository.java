package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.LabelCalendar;

public interface LabelCalendarRepository extends JpaRepository<LabelCalendar, Long> {

    // Additional query methods can be defined here if needed
    
}
