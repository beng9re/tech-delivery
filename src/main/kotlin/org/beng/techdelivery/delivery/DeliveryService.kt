package org.beng.techdelivery.delivery

import org.beng.techdelivery.delivery.dto.DeliveryContentCommend
import org.springframework.stereotype.Service

@Service
class DeliveryService(
    private val deliveryRepository: DeliveryRepository,
) {
    fun saveDeliveryContent(deliveryContentCommend: DeliveryContentCommend): Long? =
        deliveryRepository
            .save(
                DeliveryContent(
                    title = deliveryContentCommend.title,
                    content = deliveryContentCommend.content,
                    link = deliveryContentCommend.url,
                ),
            ).id
}
