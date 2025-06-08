package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swp391.project.DeliverySystem.entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Long>{
    
}
