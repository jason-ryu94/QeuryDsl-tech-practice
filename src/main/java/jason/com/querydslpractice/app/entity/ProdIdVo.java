package jason.com.querydslpractice.app.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProdIdVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String odrRcptId;

    private Long prodSno;

    public ProdIdVo(String odrRcptId, Long prodSno) {
        this.odrRcptId = odrRcptId;
        this.prodSno = prodSno;
    }
}
