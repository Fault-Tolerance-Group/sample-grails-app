package sample.grails.app

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloControllerSpec extends Specification {

    void "test controller response"() {
        when:"index method is called"
        controller.index()

        then:
        response.text == "Hello, World!"
    }
}
