//package com.project.gs.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayConfig {
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("Order-service", r -> r.path("/order/**")
//                        .uri("lb://Order-service"))
//                .route("Payment-service", r -> r.path("/payment/**")
//                        .uri("lb://Payment-service"))
//                .build();
//    }
//}
