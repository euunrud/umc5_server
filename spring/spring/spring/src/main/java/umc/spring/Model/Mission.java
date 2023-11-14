package umc.spring.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "Mission")
@Entity
@Getter
@Setter
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long missionId;
    @Column(name = "msName")
    private String name;
    @Column(name = "msCondition")
    private String condition;
    @Column(name = "msPoint")
    private int point;
    private Date timeLimit;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storeId")
    private Store store;
}
