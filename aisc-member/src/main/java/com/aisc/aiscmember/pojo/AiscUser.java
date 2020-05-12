package com.aisc.aiscmember.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "aisc_user")
public class AiscUser implements Serializable {
    /**
     * 用户id
     */
    @Id
    private Integer id;

    /**
     * 用户昵称
     */
    private String name;

    /**
     * 用户性别（1 男 2女）
     */
    private Integer sex;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 用户身份证号
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 用户头像
     */
    private String image;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户id
     *
     * @return id - 用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户昵称
     *
     * @return name - 用户昵称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户昵称
     *
     * @param name 用户昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户性别（1 男 2女）
     *
     * @return sex - 用户性别（1 男 2女）
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置用户性别（1 男 2女）
     *
     * @param sex 用户性别（1 男 2女）
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取用户年龄
     *
     * @return age - 用户年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置用户年龄
     *
     * @param age 用户年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取用户邮箱
     *
     * @return email - 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱
     *
     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用户手机号
     *
     * @return mobile - 用户手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置用户手机号
     *
     * @param mobile 用户手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取用户身份证号
     *
     * @return id_card - 用户身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置用户身份证号
     *
     * @param idCard 用户身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取用户头像
     *
     * @return image - 用户头像
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置用户头像
     *
     * @param image 用户头像
     */
    public void setImage(String image) {
        this.image = image;
    }
}