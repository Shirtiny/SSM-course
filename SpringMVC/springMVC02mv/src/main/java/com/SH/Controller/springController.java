package com.SH.Controller;

import com.SH.Bean.User;
import com.SH.Bean.UserCard;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

//@SessionAttributes(value = {"user1","user2"})//将多个属性放入request作用域的同时放入session作用域,可以精准到对象名，也可以指定类名
@SessionAttributes(types = {User.class})//指定类名的方式,将同类的所有对象都放入session,注意是先放入request再放入session，对象在request域中没有的话会报错
@Controller
@RequestMapping(value = "spController")
public class springController {


    @RequestMapping("GetUser")
    public String GetUser(User user,UserCard userCard){//这样直接就能将用户的输入注入到User属性中
        System.out.println(user+"--"+userCard);
        return "OK";
    }




    @RequestMapping(value = "testModelAndView")
    public ModelAndView testModelAndView(){//返回类型为ModelAndView，要分别给view赋值（设置跳转到的页面）,给model赋值（放入对象）
        ModelAndView mv=new ModelAndView("result");//给view赋值
        User user=new User();
        user.setUname("miku");
        user.setUpassword("456789");
        mv.addObject("user1",user);
        return mv;
    }





    @RequestMapping(value = "testModel")
    public String testModel(Model m){//返回类型为字符串，直接在形参用，放入对象即可
        User user=new User();
        user.setUname("kimet");
        user.setUpassword("123456");

        m.addAttribute("user2",user);

        return "result";
    }

    //【修改用户】-模拟查询，记得要先查询获取到对象的值，再进行某一属性的修改，否则其他属性是空
    @ModelAttribute//每次请求前都先执行
    //注意没有requestMapping注解
    public void getOne(Map<String,Object> map){//map，泛型可定可不定
        User user=new User();
        user.setUid(1);
        user.setUname("miku");
        user.setUsex("female");
//        System.out.println(user);
//        map.put("user",user);//使用map的put，将user传给updateOne的User,"user"要小写，匹配对象（方法参数类型的首字母）可以大写
        map.put("userxxx",user);//使用map的put，将user传给updateOne的User,"userAlter"与类名不匹配时，在传递对象的方法形参中使用注解@ModelAtrribute声明
    }

    //【修改用户】-模拟修改，前端链接填这个
    @RequestMapping(value = "updateOne")
//    public String updateOne(User user){
    public String updateOne(@ModelAttribute("userxxx") User user){//意思就是可以自定义传参，不用约定方式传参也行
        System.out.println(user);
        return "OK";
    }


    //string到User的类型转换器测试
   @RequestMapping(value = "testConvertor")
    public String testConvertor(@RequestParam("UserString") User user){//注意指定接收的前端的参数
       System.out.println(user);
        return "OK";
    }

//    日期数据格式化测试
    @RequestMapping(value = "testDateFormat")
    public void testDateFormat( UserCard userCard){
        System.out.println(userCard);
    }
}
