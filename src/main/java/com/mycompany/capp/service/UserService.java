package com.mycompany.capp.service;

import com.mycompany.capp.domain.User;
import com.mycompany.capp.exception.UserBlockedException;
import java.util.List;

/**
 *
 * @author manish
 */
public interface UserService {

    public static final Integer LOGIN_STATUS_ACTIVE = 1;
    public static final Integer LOGIN_STATUS_BLOCKED = 2;

    public static final Integer ROLE_ADMIN = 1;
    public static final Integer ROLE_USER = 2;

    public void register(User u);

    /**
     * The method handle login operation(authentication) using given
     * credentials,returns user object when success and null when failed
     *
     * @param loginName
     * @param password
     * @return
     * @throws UserBlockedException when user account is Blocked
     */
    public User login(String loginName, String password) throws UserBlockedException;

    /**
     * Call this method to get list of registered users
     *
     * @return
     */
    public List<User> getUserList();

    /**
     * This method change the user login status for details passed as arguments.
     *
     * @param userid
     * @param loginStatus
     */
    public void changeLoginStatus(Integer userid, Integer loginStatus);

}
