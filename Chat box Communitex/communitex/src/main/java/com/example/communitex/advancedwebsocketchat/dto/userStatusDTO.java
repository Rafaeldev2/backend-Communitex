package com.example.communitex.advancedwebsocketchat.dto;

import lombok.Data;

@Data
public class userStatusDTO {

    private String userName;
    private String status;

    public userStatusDTO(String userName, String status) {
        this.userName = userName;
        this.status = status;
    }
}
