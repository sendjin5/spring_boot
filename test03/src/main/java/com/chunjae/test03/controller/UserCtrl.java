package com.chunjae.test03.controller;

import com.chunjae.test03.biz.UserService;
import com.chunjae.test03.entity.Euser;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/*")
public class UserCtrl {

    @Autowired
    private UserService userService;

    @Autowired
    HttpSession session;


    @GetMapping("List.do")
    public String userList(Model model) {
        List<Euser> euserList = userService.euserList();
        System.out.println(euserList);
        model.addAttribute("euserList", euserList);
        return "/user/userList";
    }

    @GetMapping("Get.do")
    public String userGet(Model model, String name){
        Euser euser = userService.euserGet(name);
        model.addAttribute("euser", euser);
        return "/user/userGet";
    }

    @GetMapping("Insert.do")
    public String userInsertForm(){
        return "/user/Insert";
    }

    @PostMapping("Insert.do")
    public String userInsert(Euser euser){
        userService.euserInsert(euser);
        return "/user/userList";
    }



    //계정상태 변경
    @GetMapping("With.do")
    public String userWith(String name) throws Exception{
        userService.euserWith(name);
        return "redirect:/user/List.do";
    }
    @GetMapping("Join.do")
    public String userJoin(String name) throws Exception{
        userService.euserActivate(name);
        return "redirect:/user/List.do";

    }
    @GetMapping("Dormant.do")
    public String userDormant(String name) throws Exception{
        userService.euserDormant(name);
        return "redirect:/user/List.do";

    }


    //아이디, 이메일 로그인    
    @GetMapping("login.do")
    public String loginForm(){ return "/user/login"; }

    @GetMapping("emaillogin.do")
    public String emailloginForm(){ return "/user/email"; }

    @PostMapping("Eamilogin.do")
    public String Eamilogin(Euser euser, Model model){
        Euser user = userService.euserEmail(euser.getEmail());
            if(user != null){
                if(user.getPw().equals(euser.getPw())) {
                    session.setAttribute("sname", user.getName());
                }else{
                    model.addAttribute("msg", "비밀번호가 다릅니다.");
                    session.invalidate();
                }
            }else{
                model.addAttribute("msg", "아이디가 없습니다.");

            }
        return "/user/userList";
    }

    @PostMapping("Idlogin.do")
    public String Idlogin(Euser euser, Model model){
        Euser user = userService.euserId(euser.getName());
        if(user != null){
            if(user.getPw().equals(euser.getPw())) {
                session.setAttribute("sname", user.getName());
            }else{
                model.addAttribute("msg", "비밀번호가 다릅니다.");
                session.invalidate();
            }
        }else{
            model.addAttribute("msg", "아이디가 없습니다.");
        }
        return "/user/userList";
    }


    //아이디, 비밀번호 찾기    
    @GetMapping("FindId.do")
    public String Findi(){
        return "/user/findId";
    }

    @GetMapping("FindPw.do")
    public String Findp(){
        return "/user/findPw";
    }



    @GetMapping("FindIdp.do")
    public String FindId(Euser euser, Model model){
        System.out.println("-------------");
        System.out.println(euser.getName());
        System.out.println("-------------");
        Euser user = userService.findById(euser);
        model.addAttribute("msg", user.getName());
        return "/user/alert";
    }

    @GetMapping("FindPwp.do")
    public String FindPw(Euser euser){
        userService.findByPw(euser);
        return "/user/alert";
    }


}
