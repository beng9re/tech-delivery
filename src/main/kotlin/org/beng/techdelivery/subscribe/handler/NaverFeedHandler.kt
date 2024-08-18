package org.beng.techdelivery.subscribe.handler

import com.rometools.rome.feed.synd.SyndEntry
import org.beng.techdelivery.subscribe.feed.FeedType
import org.springframework.integration.annotation.ServiceActivator
import org.springframework.messaging.Message
import org.springframework.stereotype.Component

@Component
class NaverFeedHandler {
    @ServiceActivator(inputChannel = FeedType.NAVER_CHANEL)
    fun handle(message: Message<*>) {
        val payload = message.payload as SyndEntry
        println("message.headers ${message.headers}")
        println("payload ${payload.link}")
        println("source ${payload.source}")
        println("title ${payload.title}")
        println("title ${payload.contents}")
    }
}
