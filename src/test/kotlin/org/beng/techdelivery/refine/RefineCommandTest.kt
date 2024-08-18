package org.beng.techdelivery.refine

import org.junit.jupiter.api.Test
import org.springframework.ai.openai.OpenAiChatModel
import org.springframework.ai.openai.OpenAiChatOptions
import org.springframework.ai.openai.api.OpenAiApi
import org.springframework.ai.openai.api.OpenAiApi.ChatModel
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ChatApiConfiguration {
    @Bean
    fun chatApiModel(): OpenAiChatModel {
        val openAiChatOption =
            OpenAiChatOptions
                .builder()
                .withModel(ChatModel.GPT_4_O_MINI)
                .withTemperature(0.4.toFloat())
                .build()

        return OpenAiChatModel(OpenAiApi(API_KEY), openAiChatOption)
    }

    companion object {
        private const val API_KEY =
            "USER_API_KEY"
    }
}

@SpringBootTest
class RefineCommandTest(
    // @Autowired private val openAiChatModel: OpenAiChatModel,
) {
    @Test
    fun test() {
    }
}
