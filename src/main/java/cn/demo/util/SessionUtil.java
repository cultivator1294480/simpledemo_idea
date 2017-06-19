package cn.demo.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by chengcheng on 2017/6/13 0013.
 */
public class SessionUtil {
    /**
     * 获得session信息
     * @return
     */
    public static HttpSession getSession(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        HttpSession httpSession = request.getSession();
        return  httpSession;
    }

}
