package com.uusoft.test.common.filter;

import com.alibaba.druid.support.http.WebStatFilter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * <p>Description:配置druid监控统计功能,配置Filter</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/15 10:21
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
    initParams = {
        @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
// 忽略资源
    }
)

public class DruidStatFilter extends WebStatFilter {

}