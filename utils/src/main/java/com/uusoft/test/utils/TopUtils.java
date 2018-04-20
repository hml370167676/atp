/**
 * <p>Title: TopUtils.java</p>
 *
 * @Package com.uusoft.optt.web.utils <p>Description: </p> <p>Company:上海投投金融信息服务有限公司</p>
 * @author 周辉
 * @version V1.0
 * @since 2016年4月25日 上午11:28:38
 */
package com.uusoft.test.utils;

import com.thoughtworks.xstream.XStream;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 类描述： 用一句话描述该类的作用
 *
 * @author 周辉
 * @version V1.0
 * @company:上海投投金融有限责任公司
 * @email zhouhui@66money.com
 * @since 2016年4月19日 上午10:33:00
 */
public class TopUtils {

  private static Logger logger = LoggerFactory.getLogger(TopUtils.class);
  private static XStream xstream;

  public static void printDataToClient(Object respData, HttpServletResponse response) {
    try {
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("Pramga", "no-cache");
      response.setHeader("Cache-Control", "no-cache");
      response.setDateHeader("Expires", 0);
      PrintWriter out = response.getWriter();
      out = response.getWriter();
      out.println(toXml(respData));
      out.flush();
      out.close();
    } catch (Exception e) {
      logger.error("向客户端返回数据发生异常！", e);
    }
  }

  private static XStream getXStream() {
    if (xstream == null) {
      xstream = new XStream();
      xstream.autodetectAnnotations(true);
    }
    return xstream;
  }

  public static String toXml(Object o) {
    return getXStream().toXML(o);
  }
}
