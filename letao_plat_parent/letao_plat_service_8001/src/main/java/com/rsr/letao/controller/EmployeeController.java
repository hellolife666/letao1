package com.rsr.letao.controller;

import com.rsr.letao.domain.Employee;
import com.rsr.letao.util.AjaxResult;
import com.rsr.letao.util.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
//      method = RequestMethod.POST 表示针对什么请求的 用于区分方法。9 -
        @RequestMapping(value = "/login",method = RequestMethod.POST)
        public AjaxResult login(@RequestBody Employee employee){
            /*正常流程是，前段把数据传过来封装在 employee里面然后去里面的值通过mymatis
             发送sql去数据库查询 看看返回值是否为空 空则登陆失败，不为空则登陆成功
            * */
            if ("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword())){


               return  AjaxResult.me().setMsg("恭喜登陆成功").setSuccess(true);
            }else {

                return AjaxResult.me().setSuccess(false).setMsg("登录失败");

            }

        }

    }
