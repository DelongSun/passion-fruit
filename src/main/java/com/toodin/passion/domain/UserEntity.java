package com.toodin.passion.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author kenzo
 * @date 2022-03-30 15:42
 */
@Table("t_user")
public class UserEntity implements RowMapper<UserEntity> {

    @Id
    @Column("id")
    private Long id;

    @Column("username")
    private String username;

    @Column("age")
    private Integer age;

    @Override
    public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserEntity entity = new UserEntity();
        entity.setId(rs.getLong("id"));
        entity.setUsername(rs.getString("username"));
        entity.setAge(rs.getInt("age"));

        return entity;
    }

    // -- setter/getter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
