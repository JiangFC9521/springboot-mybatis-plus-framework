package com.example.springboot.mybatisplus.framework.filter;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author jiang
 * @since 2024-10-29
 * <p>
 * 应用场景
 * 1.过滤敏感词汇（防止sql注入）
 * 2.设置字符编码
 * 3.URL级别的权限访问控制
 * 4.压缩响应信息
 */
@WebFilter(urlPatterns = {"/hello/*"}, filterName = "demoFilter")
@Slf4j
public class DemoFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("DemoFilter过滤器 执行过滤");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        log.info("过滤器放行前，{}", requestURI);
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("过滤器放行后，{}", requestURI);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("DemoFilter过滤器 初始化");
    }

    @Override
    public void destroy() {
        log.info("DemoFilter过滤器 销毁");
    }
}
