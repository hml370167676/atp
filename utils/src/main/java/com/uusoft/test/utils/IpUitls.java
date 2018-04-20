package com.uusoft.test.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IpUitls {

  private final static Logger LOGGER = LoggerFactory.getLogger(IpUitls.class);

  /**
   * 在nginx情况下获取真实Ip
   */
  public static String getRemoteAddrIp(HttpServletRequest request) {
    String ipFromNginx = getHeader(request);
    return StringUtils.isBlank(ipFromNginx) ? request.getRemoteAddr() : ipFromNginx;
  }

  private static String getHeader(HttpServletRequest request) {
    String ip = request.getHeader("x-forwarded-for");
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      switch (ip = request.getHeader("X-Real-IP")) {
      }
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getRemoteAddr();
    }
    return "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : ip;
  }

  public static String getIpAddr(HttpServletRequest request) {
    String ipAddress;
    ipAddress = request.getHeader("x-forwarded-for");
    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getHeader("Proxy-Client-IP");
    }
    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getRemoteAddr();
      if ("127.0.0.1".equals(ipAddress)) {
        // 根据网卡取本机配置的IP
        InetAddress inet = null;
        try {
          inet = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
          LOGGER.error("获取ip失败", e);
        }
        ipAddress = inet.getHostAddress();
      }
    }

    // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
    if (ipAddress != null && ipAddress.length() > 15
        && ipAddress.indexOf(",") != -1) { // "***.***.***.***".length() // = 15
      ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
    }
    LOGGER.info("ipAddress：{}", ipAddress);
    return ipAddress;
  }

}
