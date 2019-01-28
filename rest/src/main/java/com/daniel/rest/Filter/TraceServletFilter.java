package com.daniel.rest.Filter;

import com.daniel.rest.Log.LoggerWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

@WebFilter(urlPatterns = "/*")
public class TraceServletFilter implements Filter {

    private static final AtomicLong requestIDCounter = new AtomicLong(1);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final long nanoStartTime = System.nanoTime();
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        final long requestId = requestIDCounter.getAndIncrement();

        LoggerWrapper.info(String.format("Request Queue: new request #%d: '%s %s?%s'", requestId,  request.getMethod(), request.getRequestURI(), request.getQueryString()));
        LoggerWrapper.info(String.format("Request Queue: request #%d started at '%2$tc' (%2$d)", requestId, System.currentTimeMillis()));

        filterChain.doFilter(request, response);

        long elapsedNano = System.nanoTime() - nanoStartTime;
        LoggerWrapper.info(String.format("Request Queue: request #%d finished at '%2$tc', (%2$d)", requestId, System.currentTimeMillis()));
        LoggerWrapper.info(String.format("Request Queue: request #%d elapsed time: %2$tT (%2$d ms total)", requestId, elapsedNano / 1000000));
    }

    @Override
    public void destroy() {

    }
}
