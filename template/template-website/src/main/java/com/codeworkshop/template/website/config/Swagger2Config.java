package com.codeworkshop.template.website.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    /*
     *  添加摘要信息(Docket)
     */
    @Bean
    public Docket controllerApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("标题：代码工房团队_模板项目_website模块_接口文档")
                        .description("描述：作者是个大帅B")
                        .contact(new Contact("云上盖幕",null,null))
                        .version("版本号：1.0.0-SNAPSHOT")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.codeworkshop.template.website.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
