package com.hjusic.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class RegisterUserProjectionRoot extends BaseProjectionNode {
  public RegisterUserProjectionRoot username() {
    getFields().put("username", null);
    return this;
  }

  public RegisterUserProjectionRoot email() {
    getFields().put("email", null);
    return this;
  }
}
