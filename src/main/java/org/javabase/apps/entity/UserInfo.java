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
 * UserInfo generated by hbm2java
 */
@Entity
@Table(name = "user_info", catalog = "jschool"
)
public class UserInfo implements java.io.Serializable {

	private static final long serialVersionUID = 7227691709411331103L;
	private Integer userInfoId;
    private Integer insId;
    private Integer userType;
    private String userName;
    private String userPass;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNo;
    private String alternativeContact;
    private String address;
    private String postalCode;
    private Date registerDate;
    private String image;
    private String gender;
    private String religion;
    private Date updateDate;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "user_info_id", unique = true, nullable = false)
    public Integer getUserInfoId() {
        return this.userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    @Column(name = "ins_id")
    public Integer getInsId() {
        return this.insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    @Column(name = "user_type")
    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Column(name = "user_name", length = 45)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "user_pass", length = 45)
    public String getUserPass() {
        return this.userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Column(name = "first_name", length = 45)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", length = 45)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email", length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "contact_no", length = 45)
    public String getContactNo() {
        return this.contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Column(name = "alternative_contact", length = 45)
    public String getAlternativeContact() {
        return this.alternativeContact;
    }

    public void setAlternativeContact(String alternativeContact) {
        this.alternativeContact = alternativeContact;
    }

    @Column(name = "address", length = 150)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "postal_code", length = 45)
    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "register_date", length = 19)
    public Date getRegisterDate() {
        return this.registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Column(name = "image", length = 45)
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "gender", length = 45)
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "religion", length = 45)
    public String getReligion() {
        return this.religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date", length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
