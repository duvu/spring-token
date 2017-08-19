package duvu.github.securitytoken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author beou on 8/20/17 02:18
 * @version 1.0
 */
@RestController
public class LoginController {

    @Autowired

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity login() {
        //return adminService.login(loginModel);
        return null;
    }
}
