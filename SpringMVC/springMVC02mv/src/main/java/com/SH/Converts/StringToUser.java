package com.SH.Converts;

import com.SH.Bean.User;
import org.springframework.core.convert.converter.Converter;
//类型转换器,还要在springMVC.xml中配置,Controller运行时 如果传参类型不一致，会自动找对应的转换器,记得Controller参数要指定

public class StringToUser implements Converter<String, User> {//实现Converter借口，并自定义泛型约束（就是想让什么类型转到什么类型）
    @Override
    public User convert(String s) {//这里字符串s就是输入的字符串，如uname-upassword-usex-uid

        User user=new User();
        String[] userPara = s.split("-");//将输入的字符串按照"-"拆分，产生一个字符串数组
        user.setUname(userPara[0]);//分别将数组的元素放入User中对应的属性里
        user.setUpassword(userPara[1]);
        user.setUsex(userPara[2]);
        user.setUid(Integer.parseInt(userPara[3]) );//记得从字符串到int要强转类型
        return user;
    }
}
