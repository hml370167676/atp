package com.uusoft.test.utils.convert;

import com.alibaba.fastjson.JSON;
import com.thoughtworks.xstream.XStream;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/23 14:28
 */
@SpringBootTest
@TestExecutionListeners(listeners = MockitoTestExecutionListener.class)
public class XStreamTest extends AbstractTestNGSpringContextTests {

  String  json = "{\n"
      + "          \"instId\": \"F00000390\",\n"
      + "          \"platformno\": \"2018011900A00003904RG00003018056\",\n"
      + "          \"tano\": []\n"
      + "}";

  @Test
  public void testFastJson() {

    XStream xStream = new XStream();


  }
}
