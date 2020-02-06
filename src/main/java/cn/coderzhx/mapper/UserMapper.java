package cn.coderzhx.mapper;

import cn.coderzhx.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;

/**
 *
 *
 */
@Mapper
@Configuration
public interface UserMapper {
    User findByName(String name);
}
