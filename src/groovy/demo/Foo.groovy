// src/groovy/demo/Foo.groovy
package demo

import grails.validation.Validateable

@Validateable
class Foo {
    Integer noDefault;
    Integer withDefault = 1;

    static constraints = {
        noDefault(nullable:false)
        withDefault(nullable:false)
    }
}
