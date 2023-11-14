package umc.spring.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "MyMission")
@Entity
@Getter
@Setter
public class MyMission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mmId;
    private int dDay;
    @Column(name = "success")
    private String sof;

    @OneToOne
    @JoinColumn(name = "missionId")
    private Mission mission;

    @OneToOne
    @JoinColumn(name = "mngId")
    private ManageMission manageMission;
}
