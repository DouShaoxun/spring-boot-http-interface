package cn.cruder.dousx.sbhi.config;

import cn.cruder.dousx.sbhi.http.OrderHttpApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;


@Configuration
public class HttpExchangeConfig {
    /**
     * <a href="https://docs.spring.io/spring-framework/docs/6.0.0/reference/html/integration.html#rest-http-interface">参考文档</a>
     *
     * @return {@link OrderHttpApi}
     */
    @Bean
    public OrderHttpApi orderHttpApi() {
        WebClient client = WebClient.builder().baseUrl("http://localhost:7900/").build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
        return factory.createClient(OrderHttpApi.class);
    }


}
