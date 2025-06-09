package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swp391.project.DeliverySystem.entity.Customers;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customers, Long>{
    Optional<Customers> findByEmail(String email);
}
