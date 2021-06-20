package com.example.sslserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;


@Configuration
public  class AppConf implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {/*configurePathMatch not final*/}

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer)
    {/*configureContentNegotiation not final*/}

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer)
    {/*configureAsyncSupport not final*/}

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer)
    {/*configureDefaultServletHandling not final*/}

    @Override
    public void addFormatters(FormatterRegistry formatterRegistry)
    {/*addFormatters not final*/}

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry)
    {/*addInterceptors not final*/}

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry)
    {/*addResourceHandlers not final*/}

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry)
    {/*addViewControllers not final*/}

    @Override
    public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry)
    {/*configureViewResolvers not final*/}

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list)
    {/*addArgumentResolvers not final*/}

    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list)
    {/*addReturnValueHandlers not final*/}

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> list)
    {/*configureMessageConverters not final*/}

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> list)
    {/*extendMessageConverters not final*/}

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list)
    {/*configureHandlerExceptionResolvers not final*/}

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> list)
    {/*extendHandlerExceptionResolvers not final*/}

    @Override
    public Validator getValidator() {
        return null;
    }

    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }


}
