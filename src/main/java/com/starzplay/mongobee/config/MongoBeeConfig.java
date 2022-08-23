//package com.starzplay.mongobee.config;
//
//import com.github.mongobee.Mongobee;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class MongoBeeConfig {
//    @Value("${mongodb.uri}")
//    private String mongoDbUri;
//
//    @Value("${mongobee.enabled}")
//    private boolean enabled;
//
//    @Bean
//    public Mongobee mongobee() {
//        Mongobee runner = new Mongobee(mongoDbUri);
//        runner.setChangeLogsScanPackage("com.starzplay.identity.config.migration");
//        runner.setEnabled(enabled);
//        return runner;
//    }
////    mongodb.primary.database=user_identity_test_sp
////    mongodb.primary.host=sp-mongo-tst-shard-00-01.9srbc.mongodb.net
////    mongodb.primary.port=27017
////    mongodb.primary.username=admin
////    mongodb.primary.password=abc456
////    mongodb.primary.authentication-database=admin
//}