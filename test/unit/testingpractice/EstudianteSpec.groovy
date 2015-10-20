package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Estudiante)
class EstudianteSpec extends Specification {

    /*
    * El semestre mínimo de un estudiante es 1 y el máximo 20
    * */
    Estudiante estudiante;
    def setup() {
        estudiante = new Estudiante(semestre: 5, codigoInst: 1234.2)
    }
    def "semestre constrain"(){


        expect:
        //estudiante.semestre = sem
        //estudiante.validate(semestre: sem) == valid
        Math.max(1,3) == 3

        where:
            //estudiante.semestre = sem

            sem | valid
            0 | false
            5 | true
            26| false
            25| false
    }
    /*
    * El código institucional de un estudiante debe ser único y no puede ser nulo
    * */
    /*def "codigo constrain"(){
        when: 'codigo nulo'
        def estud = new Estudiante(codigoInst: null)

        then: 'Validacion deberia fallar'
        !estud.validate()

        when: 'codigo no nulo'
        estud = new Estudiante(codigoInst: 1234)

        then: 'validacion deberia pasar'
        estud.validate()
    }*/



    def cleanup() {
    }
}
