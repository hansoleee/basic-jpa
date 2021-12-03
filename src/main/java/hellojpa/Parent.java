package hellojpa;

import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@ToString
public class Parent {

    @Id
    @Column(name = "parent_id")
    private String id;

    private String name;
}
