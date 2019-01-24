package com.daniel.rest.dao;
import java.util.List;

import com.daniel.rest.model.ApiName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiJpaDao extends JpaRepository<ApiName, Integer> {
    // 单条件查询   会生成where ApiHost=?
    List<ApiName> findByApiHost(String ApiHost);
    //and组合查询  会生成 where ApiName=? And ApiHost=?
    List<ApiName> findByApiNameAndApiHost(String ApiName, String ApiHost);
}