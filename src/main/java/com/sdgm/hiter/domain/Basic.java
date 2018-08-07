package com.sdgm.hiter.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="basic")
public class Basic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="basic_id")
    private Long basicid;

    @Column(name="basic_title")
    private String basictitle;

    @Column(name="basic_hit")
    private Long basichit;

    @Column(name="basic_datetime")
    private Date basicdate;

    @Column(name="basic_updatetime")
    private Date basicupdatetime;

    public Long getBasicid() {
        return basicid;
    }

    public void setBasicid(Long basicid) {
        this.basicid = basicid;
    }

    public Long getBasichit() {
        return basichit;
    }

    public void setBasichit(Long basichit) {
        this.basichit = basichit;
    }

    public Date getBasicdate() {
        return basicdate;
    }

    public void setBasicdate(Date basicdate) {
        this.basicdate = basicdate;
    }

    public Date getBasicupdatetime() {
        return basicupdatetime;
    }

    public void setBasicupdatetime(Date basicupdatetime) {
        this.basicupdatetime = basicupdatetime;
    }

    public String getBasictitle() {
        return basictitle;
    }

    public void setBasictitle(String basictitle) {
        this.basictitle = basictitle;
    }
}
