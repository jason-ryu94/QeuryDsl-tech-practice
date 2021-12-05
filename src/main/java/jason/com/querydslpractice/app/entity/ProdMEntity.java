package jason.com.querydslpractice.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProdMEntity {

    @Id
    private String prodMId;

    private String prodCd;

    private String prodNm;

}
