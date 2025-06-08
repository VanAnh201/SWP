package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.dto.FeedbackDTO;
import swp391.project.DeliverySystem.entity.Feedback;

public class FeedbackMapper {
    public static FeedbackDTO mapToFeedbackDTO(Feedback feedback) {
        if (feedback == null) return null;
        return new FeedbackDTO(
            feedback.getId() != null ? feedback.getId().intValue() : null,
            feedback.getCustomer(),
            feedback.getOrderRequest(),
            feedback.getRating(),
            feedback.getComment(),
            feedback.getFeedbackDate() != null ? feedback.getFeedbackDate().toString() : null
        );
    }

    public static Feedback mapToFeedback(FeedbackDTO feedbackDTO) {
        if (feedbackDTO == null) return null;
        Feedback feedback = new Feedback();
        feedback.setId(feedbackDTO.getId() != null ? feedbackDTO.getId().longValue() : null);
        feedback.setCustomer(feedbackDTO.getCustomer());
        feedback.setOrderRequest(feedbackDTO.getOrderRequest());
        feedback.setRating(feedbackDTO.getRating());
        feedback.setComment(feedbackDTO.getComment());
        feedback.setFeedbackDate(feedbackDTO.getFeedbackDate() != null ? java.time.LocalDate.parse(feedbackDTO.getFeedbackDate()) : null);
        return feedback;
    }
}