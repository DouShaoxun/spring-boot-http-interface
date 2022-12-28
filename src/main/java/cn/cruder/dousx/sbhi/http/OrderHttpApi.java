package cn.cruder.dousx.sbhi.http;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(value = "/Order")
public interface OrderHttpApi {
    /**
     * {@code curl --location --request GET 'http://localhost:7900/Order/placeOrder?num=-1&goodsId=01' }
     *
     * @param num     num
     * @param goodsId goodsId
     * @return String
     */
    @GetExchange("/placeOrder")
    String placeOrder(@RequestParam("num") Integer num, @RequestParam("goodsId") String goodsId);
}
