package com.auth0.example.model;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserIdentityDTO {
	
	public String connection;
    public String provider;
    public String user_id;
    public boolean isSocial;

}
