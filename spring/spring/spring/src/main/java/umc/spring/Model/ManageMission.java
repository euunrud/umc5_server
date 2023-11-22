package umc.spring.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "manageMission")
@Entity
@Getter
@Setter
public class ManageMission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mngId;
    @Column(name = "mnglocation")
    private String location;
    @Column(name = "clearms")
    private int msCnt;
    @Column(name = "mngPoint")
    private int point;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
}
