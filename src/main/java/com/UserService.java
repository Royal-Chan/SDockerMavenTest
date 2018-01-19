package com;

import java.util.Map;

public interface UserService {
    public UserView getUser(String userId);
    public UserView getUserByAccount(String account);
    public Map<String, UserView> getUsersByAccounts(String[] accounts);
}
