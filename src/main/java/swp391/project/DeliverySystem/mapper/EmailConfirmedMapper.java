package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.entity.EmailConfirmed;
import swp391.project.DeliverySystem.dto.EmailComfirmedDTO;

public class EmailConfirmedMapper {
    public static EmailComfirmedDTO mapToEmailConfirmedDTO(EmailConfirmed emailConfirmed) {
        if (emailConfirmed == null) return null;
        return new EmailComfirmedDTO(
            emailConfirmed.getId() != null ? emailConfirmed.getId().intValue() : null,
            emailConfirmed.getCustomer(),
            emailConfirmed.getToken(),
            emailConfirmed.getExpirationDate()
        );
    }
    public static EmailConfirmed mapToEmailConfirmed(EmailComfirmedDTO emailComfirmedDTO) {
        if (emailComfirmedDTO == null) return null;
        EmailConfirmed emailConfirmed = new EmailConfirmed();
        emailConfirmed.setId(emailComfirmedDTO.getId() != null ? emailComfirmedDTO.getId().longValue() : null);
        emailConfirmed.setCustomer(emailComfirmedDTO.getCustomer());
        emailConfirmed.setToken(emailComfirmedDTO.getToken());
        emailConfirmed.setExpirationDate(emailComfirmedDTO.getExpirationDate());
        return emailConfirmed;
    }
}
