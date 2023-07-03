package pl.mirekdrozd.hello_kotlin

import spock.lang.Specification

import static pl.mirekdrozd.hello_kotlin.AssignmentTwoKt.sumExt

class AssignmentTwoSpec extends Specification {

    def "should sum integers within list"() {
        given: "list with numbers"
        def nums = [1,2,3,4,5,6]

        when: "extension function is called"
        def result = sumExt nums

        then: "result is the sum of all nums in that list"
        result == 21
    }
}
