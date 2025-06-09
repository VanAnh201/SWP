package swp391.project.DeliverySystem.service;

import java.util.List;

import swp391.project.DeliverySystem.dto.RolesDTO;

public interface RolesService {
    RolesDTO createRoles(RolesDTO rolesDTO);

    RolesDTO getRolesById(Long RolesId);

    List<RolesDTO> getAllRoles();

    RolesDTO updateRoles(Long RolesId, RolesDTO updatedRoles);

    void deleteRoles(Long RolesId);
}
