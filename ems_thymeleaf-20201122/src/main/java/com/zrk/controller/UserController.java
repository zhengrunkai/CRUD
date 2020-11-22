package com.zrk.controller;

import com.zrk.entity.User;
import com.zrk.service.UserService;
import com.zrk.util.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(User user, String code, HttpSession session) {
        String sessionCode = (String) session.getAttribute("code");
        if (sessionCode.equals(code)) {
            userService.register(user);
            return "redirect:/login";
        } else {
            return "redirect:/toRegister";
        }
    }

    @GetMapping("/code")
    public void getVerification(HttpSession session, HttpServletResponse response) throws IOException {
        //生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        //存入session中
        session.setAttribute("code", securityCode);
        //响应图片
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image, "png", os);
    }

    @PostMapping(value = "/login")
    public String login(String username, String password,HttpSession session) {
        User login = userService.login(username, password);
        if (login != null) {
            session.setAttribute("user",login);
            return "redirect:/emp/findAll";
        } else {
            return "redirect:/login";
        }
    }
}
