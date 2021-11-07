package com.qfedu.fmmall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "ResultVO对象", description = "封装接口返回给前端的数据")
public class ResultVo {
    @ApiModelProperty(value = "相应状态码", dataType = "int")
    private int code;
    @ApiModelProperty("响应提示信息")
    private String msg;
    @ApiModelProperty("响应数据")
    private Object data;
}
