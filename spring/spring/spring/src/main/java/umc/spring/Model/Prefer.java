package umc.spring.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "prefer")
@Entity
@Getter
@Setter
public class Prefer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preferId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;
}