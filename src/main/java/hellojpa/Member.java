package hellojpa;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "member_id")),
        @AttributeOverride(name = "name", column = @Column(name = "member_name"))
})
public class Member extends BaseEntity {
    private String email;
}
