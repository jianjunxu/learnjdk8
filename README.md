# _**spring-boot**_

## _一、hello world_

+ ### 1 环境
    + _jdk: 1.8.0_66 (1.8以上版本)_
    + _IDE:IntelliJ idea(随便什么ide)_
    + _Maven 3.3.9_
+ ### 2 用maven构建项目
    + _mvn archetype:generate -DgroupId=xxx.xxx.xxx -DartifactId=xxx -DarchetypeArtifactId=maven-archetype-webapp_
    + _mvn idea:idea_
    + _mvn clean install_
+ ### 3 spring boot helloworld
    + _添加 pom.xml 文件_
    ```
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
        <modelVersion>4.0.0</modelVersion>
        <groupId>com.jayden.learnspringboot</groupId>
        <artifactId>learnspringboot</artifactId>
        <packaging>war</packaging>
        <version>1.0-SNAPSHOT</version>
        <name>learnspringboot Maven Webapp</name>
        <url>http://maven.apache.org</url>
    
        <parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>1.5.2.RELEASE</version>
        </parent>
    
        <properties>
            <java.version>1.8</java.version>
        </properties>
    
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
        </dependencies>
        <build>
            <finalName>learnspringboot</finalName>
            <plugins>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <configuration>
                        <source>1.8</source>
                        <target>1.8</target>
                    </configuration>
                </plugin>
            </plugins>
        </build>
    
        <repositories>
            <repository>
                <id>spring-releases</id>
                <url>https://repo.spring.io/libs-release</url>
            </repository>
        </repositories>
        <pluginRepositories>
            <pluginRepository>
                <id>spring-releases</id>
                <url>https://repo.spring.io/libs-release</url>
            </pluginRepository>
        </pluginRepositories>
    
    </project>

    ```
    + _添加 controller 类_
    ```
    package com.jayden.basic.controller;
    
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    
    /**
     * Created by za-xujianjun on 2017/3/28.
     */
    @RestController
    public class HelloController {
        @RequestMapping("/helloworld")
        public String sayHello(){
            return "Hello World!";
        }
    }

    ```
    + _添加 项目启动 类_
    ```
    package com.jayden.basic;
    
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    
    /**
     * Created by za-xujianjun on 2017/3/28.
     */
    @SpringBootApplication
    public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    }

    ```
    + _request_
    ```
    http://localhost:8080/helloworld
    ```