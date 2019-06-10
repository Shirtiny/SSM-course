package com.SH.Controller;


import com.SH.Bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "spController")
public class springController {

    @RequestMapping(value="test",method=RequestMethod.POST,params = {"uname=kimet","upassword=123","uSB!=SB"})
    public String Test(){//请求路径为spController/test,限制提交方式为post，参数限制uname upassword sSB的值，注意双引号，逗号，大括号
        return "OK";
    }

    @RequestMapping(value = "sout/{uname}")//前端的传递参数为spController/sout/Xxx
    public String Sout(@PathVariable("uname") String name){//ant（或者rest）方式传递uname的值，并定义一个参数接收
        System.out.println(name);
        return "OK";
    }

    @RequestMapping(value = "PostOne/{uid}")
    public String PostOne(@PathVariable("uid") int id){
        System.out.println("增加一个id为："+id);
        return "OK";
    }

    @RequestMapping(value = "DeleteOne/{uid}")
    public String DeleteOne(@PathVariable("uid") int id){
        System.out.println("删除一个id为: "+id);
        return "OK";
    }

    @RequestMapping(value="PutOne/{uid}")
    public String PutOne(@PathVariable("uid") int id){
        System.out.println("修改了一个id为："+id);
        return "OK";
    }

    @RequestMapping(value = "GetOne/{uid}",method = RequestMethod.GET)
    public String GetOne(@PathVariable("uid") int id){
        System.out.println("查看一个id为："+id);
        return "OK";
    }

    //接收用户输入的表单信息
    @RequestMapping(value = "GetForm",method = RequestMethod.POST)
    //在方法 形参 里使用注解@RequestParam来接收元素，也可以不用注解，但定义变量时，名字要和前端name的值相同，如前后端都是uname
    //
    public String GetForm( String uname,@RequestParam(value = "upassword") String password,
                           @RequestParam(value = "usex",required = false,defaultValue = "男") String sex){//required为是否必要，defaultValue指定用户不填时的值
        System.out.println("输入的用户名为："+uname);
        System.out.println("输入的密码为："+password);
        System.out.println("用户性别为："+sex);
        return "OK";
    }

    //取得浏览器客户端的消息头或cookie
    @RequestMapping(value = "GetHeader")
    public String GetHeader(@RequestHeader(value = "Accept-Language") String head){//获取消息头中的accept-Language
        System.out.println(head);
        return "OK";
    }

    @RequestMapping(value="GetCookie")
    public String GetCookie(@CookieValue(value = "JSESSIONID") String sid){//获取Cookie中的JSESSIONID
        System.out.println(sid);
        return "OK";
    }

    //springMVC可以直接匹配对象里的属性，并自动注入，只要前后段的属性名一致就可以匹配。这是很强大的地方
    @RequestMapping(value = "GetUser")
    public String GetUser(User user){//直接创建一个user对象来接收，springMVC会自动匹配属性
        System.out.println(user);
        return "OK";
    }

    //也可以在springMVC中使用原生态的servlet里的对象，request等等，只需要在方法形参里直接创建对象就可以了，然后照旧使用
    @RequestMapping(value = "UseOldServlet")
    public String UseOldServlet(HttpServletRequest request){//只要在这创建就好
        String name=request.getParameter("uname");
        String password=request.getParameter("upassword");
        System.out.println(name+"\n"+password);
        return "OK";
    }
}
