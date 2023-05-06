package developer.api.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class WorkPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;
    private String address;

    @ManyToOne
    @JoinColumn( name = "developer_id")
    @JsonIgnore
    private Developer developer;

    public WorkPlace(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
