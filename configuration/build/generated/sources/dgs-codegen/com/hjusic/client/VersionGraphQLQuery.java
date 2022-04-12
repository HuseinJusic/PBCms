package com.hjusic.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class VersionGraphQLQuery extends GraphQLQuery {
  public VersionGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "version";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    public VersionGraphQLQuery build() {
      return new VersionGraphQLQuery();                                     
    }
  }
}
