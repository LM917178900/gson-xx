note:
### 1.pom 配置
1. 要启动初始项目需导入依赖：spring-boot-starter-web
2. mybatis项目导入依赖：mybatis-spring-boot-starter
3. postgresql项目导入：postgresql

### 2. xml配置
1. 需要配置注解 @MapperScan({"com.example.demo.mapper"})
2. 命名空间准确 <mapper namespace="com.example.demo.mapper.NormalMapper">
3. bulders依赖需要注入<resources>

### 3. yml配置
1. postgrep 配置
spring:
  datasource:
    driver-class-name: org.postgresql.Driver
    url: jdbc:postgresql://172.17.172.160:5432/portal?currentSchema=public
    username: postgres
    password: 123456
    
2. 日志配置
mybatis:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl