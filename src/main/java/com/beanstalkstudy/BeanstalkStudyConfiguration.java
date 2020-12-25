package com.beanstalkstudy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class BeanstalkStudyConfiguration {

  @Bean
  public RouterFunction<ServerResponse> route(BeanstalkStudyHandler beanstalkStudyHandler) {

    return RouterFunctions
        .route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), beanstalkStudyHandler::hello);
  }

}
