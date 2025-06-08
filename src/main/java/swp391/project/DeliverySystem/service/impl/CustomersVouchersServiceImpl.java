package swp391.project.DeliverySystem.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import swp391.project.DeliverySystem.service.CustomerVouchersService;
import swp391.project.DeliverySystem.dto.CustomerVouchersDTO;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomersVouchersServiceImpl implements CustomerVouchersService {

    @Override
    public CustomerVouchersDTO createCustomerVouchers(CustomerVouchersDTO customerVouchersDTO) {
        return null;
    }

    @Override
    public CustomerVouchersDTO getCustomerVouchersById(Long CustomerVouchersId) {
        return null;
    }

    @Override
    public List<CustomerVouchersDTO> getAllCustomerVouchers() {
        return null;
    }

    @Override
    public CustomerVouchersDTO updateCustomerVouchers(Long CustomerVouchersId, CustomerVouchersDTO customerVouchersDTO) {
        return null;
    }

    @Override
    public void deleteCustomerVouchers(Long CustomerVouchersId) {

    }
}
