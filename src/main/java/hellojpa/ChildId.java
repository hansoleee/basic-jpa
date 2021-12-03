package hellojpa;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class ChildId implements Serializable {

    private String parentId; //Child.parent 매핑

    @Column(name = "child_id")
    private String id; //Child.id 매핑
}
