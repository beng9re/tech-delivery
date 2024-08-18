package org.beng.techdelivery.subscribe

import org.beng.techdelivery.subscribe.feed.FeedType
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.integration.config.EnableIntegration
import org.springframework.integration.dsl.IntegrationFlow
import org.springframework.integration.feed.dsl.Feed

@Configuration
@EnableIntegration
class FeedSubscribeConfiguration {
    @Bean
    fun naverFeedFlow(): IntegrationFlow =
        IntegrationFlow
            .from(
                Feed
                    .inboundAdapter(FeedType.NAVER.uri.toURL(), FeedType.NAVER.name)
                    .preserveWireFeed(true),
            ).channel { c -> c.queue(FeedType.NAVER_CHANEL) }
            .get()
}
