package com.example.springboot.mybatisplus.framework.filter;

import cn.hutool.extra.servlet.ServletUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jiang
 * @since 2024-10-29
 * <p>
 * 应用场景
 * 1.登录验证，判断用户是否登录。
 * 2.权限验证，判断用户是否有权限访问资源，如校验token
 * 3.日志记录，记录请求操作日志（用户ip，访问时间等），以便统计请求访问量。
 * 4.处理cookie、本地化、国际化、主题等。
 * 5.性能监控，监控请求处理时长等。
 * 6.通用行为：读取cookie得到用户信息并将用户对象放入请求，从而方便后续流程使用，还有如提取Locale、Theme信息等，只要是多个处理器都需要的即可使用拦截器实现）
 */
@Slf4j
@Component
public class DemoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("DemoInterceptor拦截器 preHandle");
        String clientIP = ServletUtil.getClientIP(request);
        log.info("访问IP:"+clientIP);
        log.info("请求路径：{}", request.getRequestURI());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("DemoInterceptor拦截器 postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("DemoInterceptor拦截器 afterCompletion");
    }
}

