package com.hjusic.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class RegisteredUser {
  private String username;

  private String email;

  public RegisteredUser() {
  }

  public RegisteredUser(String username, String email) {
    this.username = username;
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "RegisteredUser{" + "username='" + username + "'," +"email='" + email + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisteredUser that = (RegisteredUser) o;
        return java.util.Objects.equals(username, that.username) &&
                            java.util.Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(username, email);
  }

  public static com.hjusic.types.RegisteredUser.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String username;

    private String email;

    public RegisteredUser build() {
                  com.hjusic.types.RegisteredUser result = new com.hjusic.types.RegisteredUser();
                      result.username = this.username;
          result.email = this.email;
                      return result;
    }

    public com.hjusic.types.RegisteredUser.Builder username(String username) {
      this.username = username;
      return this;
    }

    public com.hjusic.types.RegisteredUser.Builder email(String email) {
      this.email = email;
      return this;
    }
  }
}
