package com.deardogbit.backend.entity;

public class TmpUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmp_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmp_user.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmp_user.sex
     *
     * @mbggenerated
     */
    private Short sex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmp_user.id
     *
     * @return the value of tmp_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmp_user.id
     *
     * @param id the value for tmp_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmp_user.name
     *
     * @return the value of tmp_user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmp_user.name
     *
     * @param name the value for tmp_user.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmp_user.sex
     *
     * @return the value of tmp_user.sex
     *
     * @mbggenerated
     */
    public Short getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmp_user.sex
     *
     * @param sex the value for tmp_user.sex
     *
     * @mbggenerated
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }
}