package com.example.springboot.mybatisplus.framework.filter;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author jiang
 * @since 2024-10-29
 */
@WebFilter(urlPatterns = {"/hello/*"}, filterName = "demoFilter")
@Slf4j
public class DemoFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("DemoFilter doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("DemoFilter init");
    }

    @Override
    public void destroy() {
        log.info("DemoFilter destroy");
    }
}
