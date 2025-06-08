package swp391.project.DeliverySystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Labels")
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LabelName", nullable = false, unique = true, length = 100)
    private String labelName;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "ContactInfo", length = 250)
    private String contactInfo;

    @Column(name = "Status", length = 100)
    private String status;
}
