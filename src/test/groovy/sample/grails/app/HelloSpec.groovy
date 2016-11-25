package sample.grails.app

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloSpec extends Specification {

    void "test something"() {
        when:
        controller.index()

        then:
        '{"message":"Hello, World!"}' == response.text
    }
}
