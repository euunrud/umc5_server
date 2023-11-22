package umc.spring.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "Review")
@Entity
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    @Column(name = "reviewer")
    private String reviewer;
    @Column(name = "reviewScore")
    private int score;
    @Column(name = "content")
    private String content;
    private Date reviewDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="storeId")
    private Store store;
}
