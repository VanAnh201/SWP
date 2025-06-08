package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.OrderRequests;

public interface OrderRequestsRepository extends JpaRepository<OrderRequests, Long> {

    // Additional query methods can be defined here if needed

}
