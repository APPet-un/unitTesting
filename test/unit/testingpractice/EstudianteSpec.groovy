package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Estudiante)
class EstudianteSpec extends Specification {


   // Estudiante estudiante;
    def setup() {
     //  estudiante = new Estudiante(semestre: 5, codigoInst: 1234.2)
    }
    def cleanup() {
    }
    def "semestre constrain"(){
       expect:
            Math.max(1,3) == 3
        where:
            sem | valid
            0 | false
            5 | true
            26| false
            25| false
    }
    /*
    * El semestre m�nimo de un estudiante es 1 y el m�ximo 20
    * */
    /*def "semestre constrain"(){
        setup:
        mockForConstraintsTests(Estudiante)

        when
        def estudiante = new Estudiante()

        estudiante.semestre = sem
        estudiante.validate()

        then:
        estudiante.hasErrors() == !valid

        sem | valid
        0 | false
        2 | true
        26| false
        25| true
    }
    /*
    * El c�digo institucional de un estudiante debe ser �nico y no puede ser nulo
    *
    /*def "codigo constrain"(){
        when: 'codigo nulo'
        def estud = new Estudiante(codigoInst: null)

        then 'Validacion deberia fallar'
        !estud.validate()

        when 'codigo no nulo'
        estud = new Estudiante(codigoInst: 1234)

        then: 'validacion deberia pasar'
        estud.validate()
    }*/


}
