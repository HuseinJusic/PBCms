package user.graphql;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import common.model.User;
import user.domain.RegisteredUser;

@DgsComponent
public class RegisterUserGraphQlService {

    @DgsData(parentType = "Mutation", field = "registerUser")
    public RegisteredUser registeredUser(
            @InputArgument("email") String email,
            @InputArgument("password") String password,
            @InputArgument("username") String userName){

        return null;
    }
}
