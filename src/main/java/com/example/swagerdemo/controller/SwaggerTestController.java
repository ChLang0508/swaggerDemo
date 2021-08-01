package com.example.swagerdemo.controller;

import com.example.swagerdemo.Model.Comment;
import com.example.swagerdemo.Model.QueryDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "swagger测试接口")
public class SwaggerTestController {
    @PostMapping("post")
    @ApiOperation(value = "post测试",notes = "swagger2 ApiOperation注解测试")
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 400, message = "参数错误")
    })
    public ResponseEntity<Comment> post(@RequestBody QueryDto queryDto){
        return new ResponseEntity<>(new Comment(), HttpStatus.OK);
    }

    @GetMapping("get/{mobile}")
    @ApiOperation(value = "post测试",notes = "swagger2 ApiOperation注解测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mobile",value="手机号",required=true,paramType="path",defaultValue = "110"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="header",dataType = "String"),
            @ApiImplicitParam(name="age",value="年龄",required=true,paramType="form",dataType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 400, message = "参数错误")
    })
    public ResponseEntity<Comment> get(@PathVariable String mobile,
                                       @RequestHeader String password,
                                       @RequestParam Integer age){
        return new ResponseEntity<>(new Comment(), HttpStatus.OK);
    }
}
