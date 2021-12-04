package jason.com.querydslpractice.app.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "ESMA_RCP")
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RcpEntity {

    @Id
    @GeneratedValue
    private String rcpId;

    private String odrRcptId;

    private String workOdrId;

    private String prssDivsCd;

    private String cnclRsnCd;

    private String dealCd;

    private LocalDateTime dataInputTime;

    private String trmKndCd;

    private String entrId;

    private Long aptId;

    private Long egnrUserId;



}
