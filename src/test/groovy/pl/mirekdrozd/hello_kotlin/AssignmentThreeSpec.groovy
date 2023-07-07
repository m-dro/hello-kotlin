package pl.mirekdrozd.hello_kotlin

import spock.lang.Specification


class AssignmentThreeSpec extends Specification {

    def "should return true for null or empty string"() {
        given: "null and empty strings"
        String s1 = null
        def s2 = ""

        expect: "return true"
        use(AssignmentThreeKt){
            s1?.isEmptyOrNull()
            s2?.isEmptyOrNull()
        }
    }

}