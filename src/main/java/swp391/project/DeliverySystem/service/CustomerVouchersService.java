package swp391.project.DeliverySystem.service;

import java.util.List;

import swp391.project.DeliverySystem.dto.CustomerVouchersDTO;

public interface CustomerVouchersService {
    CustomerVouchersDTO createCustomerVouchers(CustomerVouchersDTO customerVouchersDTO);

    CustomerVouchersDTO getCustomerVouchersById(Long CustomerVouchersId);

    List<CustomerVouchersDTO> getAllCustomerVouchers();

    CustomerVouchersDTO updateCustomerVouchers(Long CustomerVouchersId, CustomerVouchersDTO customerVouchersDTO);

    void deleteCustomerVouchers(Long CustomerVouchersId);
}
