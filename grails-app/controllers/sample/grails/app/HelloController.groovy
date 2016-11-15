package sample.grails.app


import grails.rest.*
import grails.converters.*

class HelloController {
    static responseFormats = ['json', 'xml']

    def index() {
        Map message = [message: 'Hello, World!']
        respond message
    }
}
