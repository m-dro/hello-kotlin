package pl.mirekdrozd.hello_kotlin

import pl.mirekdrozd.hello_kotlin.AssignmentOne
import spock.lang.Specification


class AssignmentOneSpec extends Specification {

    def "should check if identifiers are valid"(){
        given: "Assignment class instance"
        AssignmentOne assignment = new AssignmentOne()

        expect: "that inputs are determined invalid"
        assignment.isValidIdentifier(input) == result

        and:
        assignment.isValidIdentifierSimpler(input) == result

        where: "testing inputs are"
        input   ||   result
        "name"  ||   true
        "_name" ||   true
        "_12"   ||   true
        ""      ||   false
        "012"   ||   false
        "no\$"  ||   false
    }

}