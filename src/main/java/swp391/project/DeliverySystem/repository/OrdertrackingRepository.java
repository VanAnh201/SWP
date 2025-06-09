package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.OrderTracking;

public interface OrdertrackingRepository extends JpaRepository<OrderTracking, Long> {
}
