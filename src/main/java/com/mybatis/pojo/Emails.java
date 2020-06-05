package com.mybatis.pojo;

import lombok.Data;

@Data
public class Emails {
    private String emailId;
    private String type;

    public Emails() {
    }

    public Emails(String emailId, String type) {
        this.emailId = emailId;
        this.type = type;
    }
}
