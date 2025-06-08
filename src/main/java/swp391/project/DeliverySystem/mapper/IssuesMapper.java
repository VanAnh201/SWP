package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.entity.Issues;
import swp391.project.DeliverySystem.dto.IssuesDTO;
import swp391.project.DeliverySystem.entity.Customers;
import swp391.project.DeliverySystem.entity.OrderRequests;


public class IssuesMapper {
    public static IssuesDTO mapToIssuesDTO(Issues issues) {
        if (issues == null) return null;
        IssuesDTO dto = new IssuesDTO();
        dto.setId(issues.getId() != null ? issues.getId() : 0L);
        dto.setIncidentCode(issues.getIncidentCode());
        dto.setOrderRequest(issues.getOrder());
        dto.setCustomer(issues.getCustomer());
        // Convert LocalDateTime to LocalDate
        dto.setIncidentDate(issues.getIncidentDate() != null ? issues.getIncidentDate().toLocalDate() : null);
        dto.setDescription(issues.getDescription());
        dto.setResolution(issues.getResolution());
        dto.setStatus(issues.getStatus());
        return dto;
    }

    public static Issues mapToIssues(IssuesDTO issuesDTO, OrderRequests orderRequests, Customers customer) {
        if (issuesDTO == null) return null;
        Issues entity = new Issues();
        entity.setId(issuesDTO.getId());
        entity.setIncidentCode(issuesDTO.getIncidentCode());
        entity.setOrder(orderRequests);
        entity.setCustomer(customer);
        // Convert LocalDate to LocalDateTime (set time to start of day)
        entity.setIncidentDate(issuesDTO.getIncidentDate() != null ? issuesDTO.getIncidentDate().atStartOfDay() : null);
        entity.setDescription(issuesDTO.getDescription());
        entity.setResolution(issuesDTO.getResolution());
        entity.setStatus(issuesDTO.getStatus());
        return entity;
    }
}
