// grails-app/conf/BootStrap.groovy
import demo.Foo

class BootStrap {

    def init = { servletContext ->
        def map = [noDefault: 0]
        def foo = new Foo(map)
        println "Foo is valid? : ${foo.validate()}"
    }
    def destroy = {
    }
}
