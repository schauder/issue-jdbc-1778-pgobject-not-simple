package no.blommish

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration

@SpringBootApplication(
    exclude = [ErrorMvcAutoConfiguration::class],
)
class App
