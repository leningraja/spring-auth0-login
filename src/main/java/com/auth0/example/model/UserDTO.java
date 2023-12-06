package com.auth0.example.model;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
	
	public Date created_at;
    public String email;
    public boolean email_verified;
    public ArrayList<UserIdentityDTO> identities;
    public String name;
    public String nickname;
    public String picture;
    public Date updated_at;
    public String user_id;
    public Date last_password_reset;
    public String last_ip;
    public Date last_login;
    public int logins_count;

}
