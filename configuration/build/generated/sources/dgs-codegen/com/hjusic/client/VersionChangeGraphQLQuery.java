package com.hjusic.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class VersionChangeGraphQLQuery extends GraphQLQuery {
  public VersionChangeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "versionChange";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    public VersionChangeGraphQLQuery build() {
      return new VersionChangeGraphQLQuery();                                     
    }
  }
}
