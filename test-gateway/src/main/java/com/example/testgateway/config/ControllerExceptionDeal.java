package com.example.testgateway.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.rpc.RpcException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 处理所有controller抛出的异常
 */
@ControllerAdvice
@Slf4j
public class ControllerExceptionDeal {
    /**
     * 捕捉所有未知异常
     * @param request
     * @param response
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public Map<String,String> jsonRequest(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception{
            log.error("error",e);
            Map<String,String> obj = new HashMap<String,String>();
            obj.put("status","1");
            if(e instanceof RpcException){
                RpcException r = (RpcException) e;
                if(r.getCode() == RpcException.UNKNOWN_EXCEPTION){
                    obj.put("errMsg","远程服务未知异常！");
                }else if(r.getCode() == RpcException.NETWORK_EXCEPTION){
                    obj.put("errMsg","远程服务请求异常！");
                }else if(r.getCode() == RpcException.TIMEOUT_EXCEPTION){
                    obj.put("errMsg","远程服务请求超时！");
                }else if(r.getCode() == RpcException.BIZ_EXCEPTION){
                    obj.put("errMsg","远程服务BIZ异常！");
                }else if(r.getCode() == RpcException.FORBIDDEN_EXCEPTION){
                    obj.put("errMsg","远程服务禁用异常！");
                }else if(r.getCode() == RpcException.SERIALIZATION_EXCEPTION){
                    obj.put("errMsg","远程服务序列化异常！");
                }else{
                    obj.put("errMsg",e.getMessage());
                }
            }else{
                obj.put("errMsg",e.getMessage());
            }
            response.setContentType("application/json;charset=UTF-8");
            return obj;
    }

}
