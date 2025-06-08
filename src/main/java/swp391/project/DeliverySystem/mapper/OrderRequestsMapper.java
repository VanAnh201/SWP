package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.dto.OrderRequestsDTO;
import swp391.project.DeliverySystem.entity.*;


public class OrderRequestsMapper {
    public static OrderRequestsDTO mapToOrderRequestsDTO(OrderRequests orderRequests) {
        return new OrderRequestsDTO(
                orderRequests.getId(),
                orderRequests.getCustomer(),
                orderRequests.getTrackingNumber(),
                orderRequests.getLabel() != null ? orderRequests.getLabel().getId() : null,
                orderRequests.getSurveyStaff() != null ? orderRequests.getSurveyStaff().getId() : null,
                orderRequests.getSurveyDate(),
                orderRequests.getStorage() != null ? orderRequests.getStorage().getId() : null,
                orderRequests.getPickUpLocation(),
                orderRequests.getDeliveryLocation(),
                orderRequests.getTransport(),
                orderRequests.getPickUpDate(),
                orderRequests.getExpectedDeliveryTime(),
                orderRequests.getTotalAmount(),
                orderRequests.getStatus(),
                orderRequests.getCreatedAt(),
                orderRequests.getUpdatedAt()
        );
    }

    public static OrderRequests mapToOrderRequests(OrderRequestsDTO orderRequestsDTO,
                                                Customers customer,
                                                Label label,
                                                Staffs surveyStaff,
                                                Storage storage) {
        return new OrderRequests(
                orderRequestsDTO.getId(),
                customer,
                orderRequestsDTO.getTrackingNumber(),
                label,
                surveyStaff,
                orderRequestsDTO.getSurveyDate(),
                storage,
                orderRequestsDTO.getPickUpLocation(),
                orderRequestsDTO.getDeliveryLocation(),
                orderRequestsDTO.getTransport(),
                orderRequestsDTO.getPickUpDate(),
                orderRequestsDTO.getExpectedDeliveryTime(),
                orderRequestsDTO.getTotalAmount(),
                orderRequestsDTO.getStatus(),
                orderRequestsDTO.getCreatedAt() != null ? orderRequestsDTO.getCreatedAt() : null,
                orderRequestsDTO.getUpdatedAt() != null ? orderRequestsDTO.getUpdatedAt() : null
        );
    }
}