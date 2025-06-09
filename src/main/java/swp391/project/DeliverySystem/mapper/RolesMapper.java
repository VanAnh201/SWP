package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.dto.RolesDTO;
import swp391.project.DeliverySystem.entity.Roles;

public class RolesMapper {
    public static RolesDTO mapToRolesDTO(Roles roles) {
        return new RolesDTO(
            roles.getId(),
            roles.getRoleName()       
        );
    }
    public static Roles mapToRoles(RolesDTO rolesDTO) {
        return new Roles(
            rolesDTO.getId(),
            rolesDTO.getRoleName()
        );
    }
}
