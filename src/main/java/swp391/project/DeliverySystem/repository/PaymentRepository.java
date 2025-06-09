package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.Payment ;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    // Additional query methods can be defined here if needed

}
