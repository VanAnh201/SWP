package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.dto.PaymentDTO;
import swp391.project.DeliverySystem.entity.Payment;
import swp391.project.DeliverySystem.entity.Customers;

public class PaymentMapper {
    public static PaymentDTO mapToPaymentDTO(Payment payment) {
        return new PaymentDTO(
                payment.getId(),
                payment.getCustomer() != null ? payment.getCustomer().getId() : null,
                payment.getTotalAmount(),
                payment.getPaymentDate(),
                payment.getPaymentMethod(),
                payment.getStatus()
        );
    }

    public static Payment mapToPayment(PaymentDTO paymentDTO, Customers customer) {
        return new Payment(
                paymentDTO.getId(),
                customer,
                paymentDTO.getTotalAmount(),
                paymentDTO.getPaymentDate(),
                paymentDTO.getPaymentMethod(),
                paymentDTO.getStatus()
        );
    }
}