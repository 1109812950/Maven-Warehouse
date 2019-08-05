package com.codeworkshop.template.website.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class IndexController {

    @ApiOperation("查询")
    @RequestMapping(value = "{uid}/query", method = RequestMethod.GET, produces = "application/json")
    public String query(@PathVariable("uid") Integer uid){
        return "";
    }

    @ApiOperation("删除")
    @GetMapping("{uid}/delete")
    public String delete(@PathVariable("uid") Integer uid){
        return "";
    }

    @ApiOperation("创建")
    @RequestMapping(value = "{uid}/create", method = RequestMethod.GET, produces = "application/json")
    public String add(@PathVariable("uid") Integer uid){
        return "";
    }


    @ApiOperation("重命名")
    @GetMapping("{uid}/rename")
    public String rename(@PathVariable("uid") Integer uid){
        return "";
    }
}
