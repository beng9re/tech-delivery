package org.beng.techdelivery.delivery

import org.springframework.data.repository.CrudRepository

interface DeliveryRepository : CrudRepository<DeliveryContent, Long>
