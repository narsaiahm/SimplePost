
package samplepostapp

import grails.test.mixin.TestFor

import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(CommentController)
class CommentControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	@Test
	void testsomthing() {
		expect:
		grailsApplication != null
	}
    void "test something"() {
    }
}
