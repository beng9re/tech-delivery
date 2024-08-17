package org.beng.techdelivery.feed.subscribe.handler


import org.beng.techdelivery.feed.FeedType
import org.springframework.integration.annotation.ServiceActivator
import org.springframework.messaging.Message
import org.springframework.stereotype.Component

@Component
class NaverFeedHandler {

    @ServiceActivator(inputChannel = FeedType.NAVER_CHANEL)
    fun handle(message: Message<*>) {
        println(message)
    }
}
