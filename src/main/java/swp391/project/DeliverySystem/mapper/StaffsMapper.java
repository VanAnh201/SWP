package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.dto.StaffsDTO;
import swp391.project.DeliverySystem.entity.Staffs;
import swp391.project.DeliverySystem.entity.Label;
import swp391.project.DeliverySystem.entity.Storage;

public class StaffsMapper {
    public static StaffsDTO mapToStaffsDTO(Staffs staffs) {
        return new StaffsDTO(
                staffs.getId(),
                staffs.getFullName(),
                staffs.getEmail(),
                staffs.getPhoneNumber(),
                staffs.getLabel() != null ? staffs.getLabel().getId() : null,
                staffs.getStorage() != null ? staffs.getStorage().getId() : null,
                staffs.getStatus()
        );
    }

    public static Staffs mapToStaffs(StaffsDTO staffsDTO, Label label, Storage storage) {
        return new Staffs(
                staffsDTO.getId(),
                staffsDTO.getFullName(),
                staffsDTO.getEmail(),
                staffsDTO.getPhoneNumber(),
                label,
                storage,
                staffsDTO.getStatus()
        );
    }
}