package br.com.testmicronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("/micronaut")
@RequiredArgsConstructor
public class UsersMicronautController {

        @Get("/users/")
        public String get() {
            return "hello";
        }
}
