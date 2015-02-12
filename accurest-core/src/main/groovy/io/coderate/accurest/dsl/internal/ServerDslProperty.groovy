package io.coderate.accurest.dsl.internal
import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@CompileStatic
@EqualsAndHashCode(includeFields = true)
@ToString(includePackage = false)
class ServerDslProperty extends DslProperty {

    ServerDslProperty(Object clientValue, Object serverValue) {
        super(clientValue, serverValue) }

    ServerDslProperty(Object singleValue) {
        super(singleValue)
    }
}
