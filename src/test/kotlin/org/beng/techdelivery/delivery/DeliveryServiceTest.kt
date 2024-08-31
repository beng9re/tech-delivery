package org.beng.techdelivery.delivery

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.beng.techdelivery.delivery.dto.DeliveryContentCommend
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DeliveryServiceTest(
    private val deliveryService: DeliveryService,
    private val deliveryRepository: DeliveryRepository,
) : BehaviorSpec({
        Given("Delivery Commend 주어지면") {
            val deliveryContentCommend = DeliveryContentCommend(content = "컨텐츠", title = "타이틀", url = "url")
            When("컨텐츠 저장을 요청하면") {
                val contentId = deliveryService.saveDeliveryContent(deliveryContentCommend)
                Then("저장이 된다") {
                    val content = deliveryRepository.findById(contentId!!).get()

                    content.title shouldBe deliveryContentCommend.title
                    content.link shouldBe deliveryContentCommend.url
                    content.content shouldBe deliveryContentCommend.content
                }
            }
        }
    })
