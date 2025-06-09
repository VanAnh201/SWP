package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.entity.CustomerVouchers;
import swp391.project.DeliverySystem.dto.CustomerVouchersDTO;

public class CustomerVouchersMapper {
    public static CustomerVouchersDTO mapToCustomerVouchersDTO(CustomerVouchers customerVouchers) {
        if (customerVouchers == null) return null;
        return new CustomerVouchersDTO(
            customerVouchers.getId() != null ? customerVouchers.getId().intValue() : null,
            customerVouchers.getCustomer(),
            customerVouchers.getVoucher(),
            customerVouchers.getUsedAt(),
            customerVouchers.getIsUsed()
        );
    }

    public static CustomerVouchers mapToCustomerVouchers(CustomerVouchersDTO customerVouchersDTO) {
        if (customerVouchersDTO == null) return null;
        CustomerVouchers customerVouchers = new CustomerVouchers();
        customerVouchers.setId(customerVouchersDTO.getId() != null ? customerVouchersDTO.getId().longValue() : null);
        customerVouchers.setCustomer(customerVouchersDTO.getCustomer());
        customerVouchers.setVoucher(customerVouchersDTO.getVouchers());
        customerVouchers.setUsedAt(customerVouchersDTO.getUsedAt());
        customerVouchers.setIsUsed(customerVouchersDTO.getIsUsed());
        return customerVouchers;
    }
}

