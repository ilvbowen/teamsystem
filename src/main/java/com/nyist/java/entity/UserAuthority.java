package com.nyist.java.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhoukaili on 2017/6/13.
 */
@Entity
public class UserAuthority {
    @Id
    @GeneratedValue
    private Integer Id;
    private String autDescription;

    public UserAuthority() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getAutDescription() {
        return autDescription;
    }

    public void setAutDescription(String autDescription) {
        this.autDescription = autDescription;
    }
}
