package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.dto.OrderTrackingDTO;
import swp391.project.DeliverySystem.entity.OrderRequests;
import swp391.project.DeliverySystem.entity.OrderTracking;

public class OrderTrackingMapper {

    public static OrderTrackingDTO toDTO(OrderTracking orderTracking) {
        if (orderTracking == null) return null;

        return new OrderTrackingDTO(
                orderTracking.getId(),
                orderTracking.getOrder() != null ? orderTracking.getOrder().getId() : null,
                orderTracking.getTrackingNumber(),
                orderTracking.getStatus(),
                orderTracking.getUpdatedAt(),
                orderTracking.getLocation(),
                orderTracking.getNotes()
        );
    }

    public static OrderTracking toEntity(OrderTrackingDTO orderTrackingDTO, OrderRequests orderRequests) {
                if (orderTrackingDTO == null) return null;

                OrderTracking orderTracking = new OrderTracking();
                orderTracking.setId(orderTrackingDTO.getId());
                orderTracking.setOrder(orderRequests);
                orderTracking.setTrackingNumber(orderTrackingDTO.getTrackingNumber());
                orderTracking.setStatus(orderTrackingDTO.getStatus());
                orderTracking.setLocation(orderTrackingDTO.getLocation());
                orderTracking.setNotes(orderTrackingDTO.getNotes());
        return orderTracking;
    }
}

