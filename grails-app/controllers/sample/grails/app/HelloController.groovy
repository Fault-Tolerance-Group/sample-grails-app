package sample.grails.app

import grails.rest.*
import grails.converters.*

class HelloController {
    static responseFormats = ['json', 'xml']

    def index() {
        // sleep for 1 second to test long running process.
        sleep(1000)
        Map message = [message: 'Hello, World!']
        respond message
    }
}
