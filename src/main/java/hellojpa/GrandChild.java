package hellojpa;

import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@ToString
public class GrandChild {

    @EmbeddedId
    private GrandChildId grandChildId;

    @MapsId("childId")
    @ManyToOne
    @JoinColumns(
            value = {
                    @JoinColumn(name = "parent_id"),
                    @JoinColumn(name = "child_id")
            },
            foreignKey = @ForeignKey(name = "grand_child_fk_parent_id_child_id"))
    private Child child;

    private String name;
}
