package com.hjusic.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class RegisterUserGraphQLQuery extends GraphQLQuery {
  public RegisterUserGraphQLQuery(String email, String username, String password,
      Set<String> fieldsSet) {
    super("mutation");
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }if (username != null || fieldsSet.contains("username")) {
        getInput().put("username", username);
    }if (password != null || fieldsSet.contains("password")) {
        getInput().put("password", password);
    }
  }

  public RegisterUserGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "registerUser";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String email;

    private String username;

    private String password;

    public RegisterUserGraphQLQuery build() {
      return new RegisterUserGraphQLQuery(email, username, password, fieldsSet);
               
    }

    public Builder email(String email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    public Builder username(String username) {
      this.username = username;
      this.fieldsSet.add("username");
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      this.fieldsSet.add("password");
      return this;
    }
  }
}
