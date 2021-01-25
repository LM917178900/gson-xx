
mybatis-plus 和 mybatis 不同之处

### 1.pom 配置
2. mybatis项目导入依赖：mybatis-plus-boot-starter


### 3. yml配置   
2. 日志配置
mybatis:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl

### 4. 代码
1. mapper extends BaseMapper<SysTask>
2. serviceImpl  extends ServiceImpl<PlusMapper, SysTask>
