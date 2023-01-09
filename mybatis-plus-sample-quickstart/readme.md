# 基本集成操作指南
## 1-包引用
```xml
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>3.5.3</version>
    </dependency>
```

## 2-mapper包扫描
### 方式一 mapper文件中添加 @Mapper 方式
这个方式更加常用
```java
package com.baomidou.mybatisplus.samples.quickstart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.quickstart.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
* 通过这个maper注解以后就可以不用
* @MapperScan 这个注解了
  */
  //@Mapper
  public interface SysUserMapper extends BaseMapper<SysUser> {

}
```


### 方式二 通过统一进行扫描进行配置
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
