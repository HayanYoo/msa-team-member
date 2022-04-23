package team.msa.member.infrastructure.webclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientService {

    private WebClient client;

    @Value("${msa.client.url.gateway}")
    private String gatewayUrl;

    public WebClientService(WebClient.Builder builder) {
        this.client = builder.baseUrl(gatewayUrl).build();
    }

}
