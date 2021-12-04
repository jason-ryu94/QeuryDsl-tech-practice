package jason.com.querydslpractice.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
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
