package com.snwellness.zuulgate;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * @Description： 过滤器
 * @Author:yangfuren
 * @Date: Created in 15:11 2018/4/2
 * @Modified By:
 */
public class MyFilter extends ZuulFilter{
    //过滤器类型 决定过滤器在哪个声明周期执行
    //pre定义在请求被路由之前执行
    //routing:路由请求时被调用
    //post:在routing和error过滤之后被调用
    //error：处理请求时发生错误时调用
    @Override
    public String filterType() {
        System.out.print("ddddddd");
        return "pre";
    }

    //过滤器的执行顺序 当存在多个过滤器的时候 根据返回值依次执行 数值越小优先级越高
    @Override
    public int filterOrder() {
        return 0;
    }

    //过滤器是否执行，实际中可以指定该过滤器为true
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
