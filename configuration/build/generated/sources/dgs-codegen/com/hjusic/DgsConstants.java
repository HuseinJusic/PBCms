package com.hjusic;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Version = "version";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String VersionChange = "versionChange";

    public static final String RegisterUser = "registerUser";
  }

  public static class REGISTEREDUSER {
    public static final String TYPE_NAME = "RegisteredUser";

    public static final String Username = "username";

    public static final String Email = "email";
  }
}
