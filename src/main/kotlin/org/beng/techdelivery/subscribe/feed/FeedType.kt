package org.beng.techdelivery.subscribe.feed

import java.net.URI


enum class FeedType(val uri: URI) {
    NAVER(URI("https://d2.naver.com/d2.atom"));

    companion object {
        const val NAVER_CHANEL = "naver-chanel"
    }
}
