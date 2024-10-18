package com.example.springboot.mybatisplus.framework.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableSwaggerBootstrapUi;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jiang
 * @since 2024-10-17
 */

@Configuration
//knife4j依赖swagger:该注解也可直接加载启动类上
@EnableSwagger2
//支持knife4j的ui:该注解也可直接加载启动类上
@EnableSwaggerBootstrapUi
public class Knife4jConfig {

    @Bean
    public Docket initDocket() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo()).select()
                // 扫描包:只扫描某个路径下带有Swagger注解的类,然后将其加入API文档
                // .apis(RequestHandlerSelectors.basePackage("com.zepal.rest.controller"))
                // 只扫描带有api注解的类
                // .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                // 只扫描带有ApiOperation注解的方法
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 对指定路径监控
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder()
                // api文档的标题属性:会在api文档中相应显示
                .title("knife4j演示 V1.0")
                // api文档描述属性:会在api文档中相应显示
                .description("我是描述")
                // 服务url属性:会在api文档中相应显示
                .termsOfServiceUrl("http://localhost:9000/")
                // 自定义版本号属性:会在api文档中相应显示
                .version("1.0")
                .build();
    }

}
