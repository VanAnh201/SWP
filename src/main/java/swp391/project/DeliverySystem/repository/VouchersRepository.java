package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.Vouchers;

public interface VouchersRepository extends JpaRepository<Vouchers, Long> {

    // Additional query methods can be defined here if needed

}
