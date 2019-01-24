package com.daniel.rest.service;
import java.util.List;
import java.util.Optional;

import com.daniel.rest.model.ApiName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiService{
    //保存
    public ApiName save(ApiName apiName);
    //更新
    public ApiName update(ApiName apiName);
    //删除
    public void delete(Integer id);
    //查询返回所有列表
    public List<ApiName> findAll();
    //查询一条记录
    public Optional<ApiName> findOne(Integer id);
    //通过host查询
    public List<ApiName> findByApiHost(String ApiHost);
    //通过name 、host查询
    public List<ApiName> findByApiNameAndApiHost(String ApiName, String ApiHost);
}
