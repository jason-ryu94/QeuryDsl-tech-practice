package jason.com.querydslpractice.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AddrEntity {

    @Id
    @GeneratedValue
    private String addrId;

    private String allAddr;

    private Long aptId;

}
