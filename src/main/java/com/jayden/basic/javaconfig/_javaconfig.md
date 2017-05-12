# Java配置
>### java配置通过@Configuration 和 @Bean 来实现的。
+ @Configuration声明当前类是一个配置类，相当于spring的xml配置文件
+ @Bean注解在方法上，声明当前方法返回一个Bean

>### 使用原则：
+ 全局配置使用java配置（如数据库相关配置，MVC相关配置）
+ 业务bean的配置使用注解配置（@Service @Component @Repository @Controller）