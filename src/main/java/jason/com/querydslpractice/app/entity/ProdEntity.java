package jason.com.querydslpractice.app.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProdEntity {

    @EmbeddedId
    ProdIdVo prodId;


    private String prodCd;
}
