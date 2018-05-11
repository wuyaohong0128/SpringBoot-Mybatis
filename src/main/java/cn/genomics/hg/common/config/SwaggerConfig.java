package cn.genomics.hg.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**   
 * @Description: swaggerAPI
 * @author wuyaohong  
 * @date 2018年5月11日 下午4:02:40 
 * @version V1.0   
 */
@Configuration  
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title("springboot-mybatis-demoAPI文档")
                .contact(new Contact("wuyaohong", "https://127.0.0.1:8080/springboot-mybatis-demo", "wuyaohong@genomics.cn"))
                .version("0.0.1-SNAPSHOT")
                .description("")
                .build();
    }
}
