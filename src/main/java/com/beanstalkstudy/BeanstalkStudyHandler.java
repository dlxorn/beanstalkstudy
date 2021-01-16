package com.beanstalkstudy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class BeanstalkStudyHandler {

  private Logger logger = LoggerFactory.getLogger(BeanstalkStudyHandler.class);

  @Value("${test.test}")
  String varTest;


  public Mono<ServerResponse> hello(ServerRequest request) {
    logger.info("외부 주입 변수 값, {}" , varTest);

    return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
        .body(BodyInserters.fromValue("Hello, Spring!!!!!!!!!!!!!!!!"));
  }

}
