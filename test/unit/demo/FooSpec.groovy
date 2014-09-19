// test/unit/demo/FooSpec.groovy
package demo

import spock.lang.Specification
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin

@TestMixin(GrailsUnitTestMixin)
class FooSpec extends Specification {

    void 'test validating default values'() {
        given:
        def map = [noDefault: 0]
        def foo = new Foo(map)

        expect:
        foo.validate()
    }
}
