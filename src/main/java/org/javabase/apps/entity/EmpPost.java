package org.javabase.apps.entity;
// Generated Jan 10, 2017 12:47:22 PM by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EmpPost generated by hbm2java
 */
@Entity
@Table(name = "emp_post", catalog = "jschool"
)
public class EmpPost implements java.io.Serializable {

	private static final long serialVersionUID = 6117370898970120679L;
	private Integer empPostId;
    private Integer insId;
    private String postName;
    private String activity;
    private String details;
    private Date entryDate;
    private Date updateDate;
    private Integer entryUser;
    private Integer updateUser;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "emp_post_id", unique = true, nullable = false)
    public Integer getEmpPostId() {
        return this.empPostId;
    }

    public void setEmpPostId(Integer empPostId) {
        this.empPostId = empPostId;
    }

    @Column(name = "ins_id")
    public Integer getInsId() {
        return this.insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    @Column(name = "post_name", length = 45)
    public String getPostName() {
        return this.postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    @Column(name = "activity", length = 45)
    public String getActivity() {
        return this.activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Column(name = "details", length = 45)
    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "entry_date", length = 19)
    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date", length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "entry_user")
    public Integer getEntryUser() {
        return this.entryUser;
    }

    public void setEntryUser(Integer entryUser) {
        this.entryUser = entryUser;
    }

    @Column(name = "update_user")
    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

}
