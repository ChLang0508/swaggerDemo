package com.example.swagerdemo.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class QueryDto {
    @ApiModelProperty("string")
    private String string;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("密码")
    private String pass;
    @ApiModelProperty("id")
    private String id;
}
