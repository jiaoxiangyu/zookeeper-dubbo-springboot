package cn.lookk.customer.web;

import cn.lookk.customer.service.UserInfoService;
import cn.lookk.handleexception.exception.Assert;
import cn.lookk.handleexception.util.ResultUtil;
import cn.lookk.handleexception.vo.Result;

import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * @ClassName: UserCotroller
 * @Description: TODO
 * @Author jiaoxiangyu
 * @Date 2019/9/7
 * @Version 1.0
 * @Since JDK1.8
 */
@RestController
@RequestMapping(value = "/user/")
public class UserCotroller {

    private static final Logger logger = LoggerFactory.getLogger(UserCotroller.class);

    @Reference(version = "1.0.0")
    UserInfoService userInfoService;

    /**
     * @title:  findById
     * @description:  根据id查询
     * @param id
     * @return  org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "findOne/{id}", method = RequestMethod.GET)
    public Result findOne(@PathVariable Long id) {
        return ResultUtil.success(userInfoService.findOneById(id));
    }





    /**
     * @title:  update
     * @description:  更新
     * @param user
     * @return  cn.wt.handleexception.vo.Result
     */
 /*   @RequestMapping(value = "update", method = RequestMethod.POST)
    public Result update(User user){
        logger.info("update user={}", user);
        userService.update(user);
        return ResultUtil.success();
    }*/


}
