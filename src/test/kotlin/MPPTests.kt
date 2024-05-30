import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MPPTests: FunSpec( {
    test("simple test") {
        1 shouldBe 1
    }


})

/*
Microservice Pipeline
at a very basic level we're talking about build -> package -> deploy
but the deployment should be consumed by other modules.
* */