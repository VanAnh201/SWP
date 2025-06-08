package swp391.project.DeliverySystem.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Feedbacks")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Rating", nullable = false)
    private Integer rating;

    @Column(name = "Comment", columnDefinition = "TEXT", nullable = false)
    private String comment;

    @Column(name = "FeedbackDate", nullable = false)
    private LocalDate feedbackDate;

    @Column(name = "IsReply", nullable = false)
    private Boolean isReply;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customers customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderRequestID")
    private OrderRequests orderRequest;
}
