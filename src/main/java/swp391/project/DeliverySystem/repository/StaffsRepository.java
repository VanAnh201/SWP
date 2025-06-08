package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.Staffs;

public interface StaffsRepository extends JpaRepository<Staffs, Long> {

    // Additional query methods can be defined here if needed

}
