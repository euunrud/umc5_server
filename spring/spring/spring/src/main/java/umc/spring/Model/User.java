package umc.spring.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "User")
@Entity
@Getter
@Setter
public class User {
    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "userName")
    private String name;
    private String password;
    private Date birth;
    private String address;
    private int point;
    private String phoneNum;
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MyMission> missions = new ArrayList<>();

    public void addMission(MyMission myMission) {
        missions.add(myMission);
        myMission.setUser(this);
    }

}
