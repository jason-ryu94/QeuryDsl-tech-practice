package jason.com.querydslpractice.app.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CnclEntity {

    @Id
    @GeneratedValue
    private String cnclId;

    private String odrRcptId;

    private String workOdrId;

    private String cnclReqCntn;

    private String cnclReqDivsCd;

    private String cnclReqDttm;

    private String lastPrssDttm;


}
