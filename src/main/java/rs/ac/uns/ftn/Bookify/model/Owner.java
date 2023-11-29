package rs.ac.uns.ftn.Bookify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rs.ac.uns.ftn.Bookify.enumerations.NotificationType;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("OWNER")
public class Owner extends User {

    @ElementCollection
    @MapKeyEnumerated(EnumType.STRING)
    @CollectionTable(name = "notification_settings", joinColumns = @JoinColumn(name = "user_id"))
    @MapKeyColumn(name = "notification_type")
    @Column(name = "is_enabled")
    private Map<NotificationType, Boolean> notificationType;

    @OneToMany
    private List<Accommodation> accommodations;

    @OneToMany
    private List<Review> reviews;

}
