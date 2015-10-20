package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Curso)
class CursoSpec extends Specification {
    Curso curso1
    Curso curso2
    Curso cursoRepetido
    Curso cursoNull
    def setup() {
        curso1 = new Curso(codigo: 12,creditos: 12, descripcion: "curso ingenieria", nombre: "Software 2")
        curso2 = new Curso(codigo: 10,creditos: 5, descripcion: "curso general", nombre: "ma")
        cursoRepetido = new Curso(codigo: 10,creditos: 1, descripcion: "curso biologia", nombre: "biologia de arañas")
        cursoNull = new Curso()
    }

    def cleanup() {
    }

    def "test nombre null"() {
        expect:
        curso1.nombre != null
        cursoNull.nombre == null
    }
    def "test codigo repetido"() {
        expect:
        curso1.codigo != curso2.codigo
        curso1.codigo != cursoRepetido
    }
    def "test logitud nombre"() {
        expect:
        curso1.nombre.length() <= 50
        curso1.nombre.length() >= 3
    }
    def "test creditos"() {
        expect:
        curso1.nombre.length() <= 50
        curso1.nombre.length() >= 3
    }
}
