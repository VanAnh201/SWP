package swp391.project.DeliverySystem.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import swp391.project.DeliverySystem.dto.CustomersDTO;
import swp391.project.DeliverySystem.entity.Customers;
import swp391.project.DeliverySystem.entity.Roles;
import swp391.project.DeliverySystem.exception.ResourceNotFoundException;
import swp391.project.DeliverySystem.mapper.CustomerMapper;
import swp391.project.DeliverySystem.repository.CustomerRepository;
import swp391.project.DeliverySystem.repository.RolesRepository;
import swp391.project.DeliverySystem.service.CustomersService;

import java.util.stream.Collectors;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomersServiceImpl implements CustomersService{

    private CustomerRepository customerRepository;
    private RolesRepository rolesRepository;
    @Override
    public CustomersDTO createCustomers(CustomersDTO customersDTO) {
        Customers customers = CustomerMapper.mapToCustomers(customersDTO, null);
        Customers savedCustomers = customerRepository.save(customers);
        return CustomerMapper.mapToCustomersDTO(savedCustomers); 
    }
    @Override
    public CustomersDTO getCustomersById(Long CustomersId) {
        Customers customers = customerRepository.findById(CustomersId)
            .orElseThrow(() -> new ResourceNotFoundException("Customers not found with id: " + CustomersId));
        return CustomerMapper.mapToCustomersDTO(customers);        
    }
    @Override
    public List<CustomersDTO> getAllCustomers() {
        List<Customers> customers = customerRepository.findAll();
        return customers.stream()
            .map(customer -> CustomerMapper.mapToCustomersDTO(customer))
            .collect(Collectors.toList());
    }
    @Override
    public CustomersDTO updateCustomers(Long CustomersId, CustomersDTO updatedCustomers) {
        Customers customers = customerRepository.findById(CustomersId)
            .orElseThrow(() -> new ResourceNotFoundException("Customers not found with id: " + CustomersId));
            customers.setFullName(updatedCustomers.getFullName());
            customers.setEmail(updatedCustomers.getEmail());
            customers.setPhoneNumber(updatedCustomers.getPhoneNumber());
            customers.setCitizenId(updatedCustomers.getCitizenId());
            customers.setDateOfBirth(updatedCustomers.getDateOfBirth());
            customers.setCustomerType(updatedCustomers.getCustomerType());
            customers.setPasswordHash(updatedCustomers.getPasswordHash());
            customers.setIsEmailConfirmed(updatedCustomers.getIsEmailConfirmed());
            customers.setIsDeleted(updatedCustomers.getIsDeleted());
            Roles role = rolesRepository.findById(updatedCustomers.getRole().getId())
            .orElseThrow(() -> new ResourceNotFoundException("Role not found with id: " + updatedCustomers.getRole().getId())); 
            customers.setRole(role);
            Customers updatedCustomersObj = customerRepository.save(customers);
        return CustomerMapper.mapToCustomersDTO(updatedCustomersObj);
    }
    @Override
    public void deleteCustomers(Long CustomersId) {
        Customers customers = customerRepository.findById(CustomersId)
            .orElseThrow(() -> new ResourceNotFoundException("Customers not found with id: " + CustomersId));
        customers.setIsDeleted(true);
        customerRepository.deleteById(CustomersId);
    }
}
