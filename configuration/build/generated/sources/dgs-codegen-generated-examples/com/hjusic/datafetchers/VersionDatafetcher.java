package com.hjusic.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.lang.String;

@DgsComponent
public class VersionDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "version"
  )
  public String getVersion(DataFetchingEnvironment dataFetchingEnvironment) {
    return "";
  }
}
