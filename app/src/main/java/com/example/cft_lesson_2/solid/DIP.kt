package com.example.cft_lesson_2.solid

interface LocalSource {

    fun getOrder(): String?
}

class LocalSourceImpl : LocalSource {

    override
    fun getOrder(): String? = "Yep! I am order from local db"
}

class PostgresqlLocalSourceImpl : LocalSource {

    override
    fun getOrder(): String? = "Yep! I am order from local PostgresqlLocalSource db"
}

interface NetworkSource {

    fun getOrder(): String?
}

class NetworkSourceImpl : NetworkSource {

    override
    fun getOrder(): String? = "Yep! I am order from network"
}

interface OrderRepository {

    fun getOrder(): String?
}

class OrderRepositoryImpl(
    private val local: LocalSource,
    private val network: NetworkSource
) : OrderRepository {

    override
    fun getOrder(): String? = local.getOrder() ?: network.getOrder()
}

class OrderViewer(
    private val repository: OrderRepository
) {
    fun show() {

        print(repository.getOrder())
    }
}

class OrderViewerFactory {

    fun create(): OrderViewer {
        val local = LocalSourceImpl()
        val network = NetworkSourceImpl()
        val repository = OrderRepositoryImpl(local, network)

        return OrderViewer(repository)
    }
}

fun main() {

    val shower = OrderViewerFactory().create()

    shower.show()
}