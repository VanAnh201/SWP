package swp391.project.DeliverySystem.service;

import java.util.List;

import swp391.project.DeliverySystem.dto.CustomersDTO;

public interface CustomersService {
    CustomersDTO createCustomers(CustomersDTO customersDTO);

    CustomersDTO getCustomersById(Long CustomersId);

    List<CustomersDTO> getAllCustomers();

    CustomersDTO updateCustomers(Long CustomersId, CustomersDTO updatedCustomers);

    void deleteCustomers(Long CustomersId);
}
