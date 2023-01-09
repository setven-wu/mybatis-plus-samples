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
