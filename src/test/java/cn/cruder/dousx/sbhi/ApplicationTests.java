package cn.cruder.dousx.sbhi;

import cn.cruder.dousx.sbhi.http.OrderHttpApi;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ApplicationTests {
    @Autowired
    OrderHttpApi orderHttpApi;

    @Test
    void contextLoads() {
        String result = orderHttpApi.placeOrder(1, "01");
        log.info("result:{}", result);
    }

}
