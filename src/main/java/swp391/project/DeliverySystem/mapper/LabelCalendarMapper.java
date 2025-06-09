package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.entity.LabelCalendar;
import swp391.project.DeliverySystem.dto.LabelCalendarDTO;
import swp391.project.DeliverySystem.entity.Label;

public class LabelCalendarMapper {
    public static LabelCalendarDTO mapToLabelCalendarDTO(LabelCalendar labelCalendar) {
        if (labelCalendar == null) return null;
        LabelCalendarDTO labelCalendarDTO = new LabelCalendarDTO();
        labelCalendarDTO.setId(labelCalendar.getId() != null ? labelCalendar.getId().intValue() : null);
        labelCalendarDTO.setScheduleDate(labelCalendar.getScheduleDate());
        labelCalendarDTO.setPrice(labelCalendar.getPrice());
        labelCalendarDTO.setLabel(labelCalendar.getLabel());
        labelCalendarDTO.setOrder(labelCalendar.getOrder());
        labelCalendarDTO.setIsBooked(labelCalendar.getIsBooked());
        return labelCalendarDTO;
    }

    public static LabelCalendar mapToLabelCalendar(LabelCalendarDTO labelCalendarDTO, Label label) {
        if (label == null) return null;
        LabelCalendar labelCalendar = new LabelCalendar();
        labelCalendar.setId(labelCalendarDTO.getId() != null ? labelCalendarDTO.getId().longValue() : null);
        labelCalendar.setScheduleDate(labelCalendarDTO.getScheduleDate());
        labelCalendar.setPrice(labelCalendarDTO.getPrice());
        labelCalendar.setLabel(label);
        labelCalendar.setOrder(labelCalendarDTO.getOrder());
        labelCalendar.setIsBooked(labelCalendarDTO.getIsBooked());
        return labelCalendar;
    }
}