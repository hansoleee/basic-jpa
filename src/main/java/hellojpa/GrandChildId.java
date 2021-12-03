package hellojpa;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class GrandChildId implements Serializable {

    private ChildId childId; //GrandChild.child 매핑

    @Column(name = "grand_child_id")
    private String id; //GrandChild.id 매핑
}
