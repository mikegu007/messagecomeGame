package com.message.game.controller;

import com.message.game.constant.Constant;
import com.message.game.constant.ErrConstant;
import com.message.game.model.dto.ResultData;
import com.message.game.model.exception.XyxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ControllerAdvice
@Component
public class CommonExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(Constant.LOGGER);

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResultData handle(Exception exception) {
        String errMsg = null ;
        ResultData resultData = null;
        if(exception instanceof XyxException){
            //新营销Exception的通用异常处理方法
            XyxException e = (XyxException) exception;
            errMsg = e.getErrMsg();
            resultData = new ResultData(ResultData.FAIL,e.getErrCode(),errMsg,e.getMessage());
        }else if(exception instanceof MethodArgumentNotValidException){
            MethodArgumentNotValidException exs = (MethodArgumentNotValidException) exception;
            List<ObjectError> errList = exs.getBindingResult().getAllErrors();
            StringBuffer stringBuffer = new StringBuffer("参数校验失败:");
            for (ObjectError objectError : errList){
                stringBuffer.append(objectError.getDefaultMessage()).append(" ");
            }
            resultData = new ResultData(ResultData.FAIL,ErrConstant.INVALID_DATAFILED,"数据校验未通过",stringBuffer);
        }else{
            //未定义的异常
            logger.error("Unexcepted Error!",exception);
            resultData = new ResultData(ResultData.FAIL, ErrConstant.UNKNOWN_ERR,"Unknown Exception!",exception.getMessage());
        }
        return resultData;
    }
}
