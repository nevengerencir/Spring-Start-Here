package sqch9ex1.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import sqch9ex1.main.services.LoggedUserManagementService;
import sqch9ex1.main.services.LoginCountService;


@Component
@RequestScope
public class LoginProcessor {
    private final LoginCountService loginCountService;
    private final LoggedUserManagementService loggedUserManagementService;
    private String username;
    private String password;
    public LoginProcessor(
            LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }
    public boolean login() {
        if (loggedUserManagementService.getUsername() != null){
            return true;
        }
        String username = this.getUsername();
        String password = this.getPassword();
        boolean loginResult = false;
        if ("natalie".equals(username) && "password".equals(password)) {
            loginResult = true;
            loginCountService.count();
            System.out.println(loginCountService.getCount());
            loggedUserManagementService.setUsername(username);
        }
        return loginResult;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }}
// Omitted getters and setters
