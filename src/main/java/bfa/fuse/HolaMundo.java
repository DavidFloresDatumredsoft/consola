package bfa.fuse;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HolaMundo extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    
    rest("/hello")
      .get()
        .route()
          .transform().constant("Hello, world!");
  }
  
}