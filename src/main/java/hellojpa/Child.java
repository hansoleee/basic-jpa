package hellojpa;

import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@ToString
public class Child {

    @EmbeddedId
    private ChildId id;

    @MapsId("parentId")
    @ManyToOne
    @JoinColumn(name = "parent_id", foreignKey = @ForeignKey(name = "child_fk_parent_id"))
    private Parent parent;

    private String name;
}
