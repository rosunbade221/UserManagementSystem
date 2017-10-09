package login.manager;

import login.domain.User;

public interface UserManager {

	User createUser(String username, String password, String role);
}
