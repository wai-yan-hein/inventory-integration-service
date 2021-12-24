package com.cv.integration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "opd_details_his")
public class OPDHisDetail implements java.io.Serializable {
    @Id
    @Column(name = "opd_detail_id")
    private String id;
    @Column(name = "vou_no")
    private String vouNo;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private OPDService service;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "srv_fees2")
    private Double moFeeAmt;
    @Column(name = "srv_fees3")
    private String staffFeeAmt;
    @Column(name = "srv_fees4")
    private String techFeeAmt;
    @Column(name = "srv_fees5")
    private String referFeeAmt;
    @Column(name = "srv_fees6")
    private String readFeeAmt;


    public OPDHisDetail() {
    }
}
