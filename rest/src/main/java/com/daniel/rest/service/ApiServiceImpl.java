package com.daniel.rest.service;

import java.util.List;
import java.util.Optional;

import com.daniel.rest.dao.ApiJpaDao;
import com.daniel.rest.model.ApiName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //要加这个注解 表示 为service层，才会自动扫描关生成beans
public class ApiServiceImpl implements ApiService {
    
    @Autowired  //加这个注解会自动new
    private ApiJpaDao apiJpaDao;

    public ApiName save(ApiName apiName) {
        return apiJpaDao.save(apiName);
    }
    
    public ApiName update(ApiName apiName) {
        return apiJpaDao.save(apiName);
    }
    
    public void delete(Integer id){
        apiJpaDao.deleteById(id);
    }
    
    public List<ApiName> findAll() {
        return apiJpaDao.findAll();
    }
    
    public Optional<ApiName> findOne(Integer id) {
        return apiJpaDao.findById(id);
    }

    public List<ApiName> findByApiHost(String ApiHost){
        return apiJpaDao.findByApiHost(ApiHost);
    }

    public List<ApiName> findByApiNameAndApiHost(String ApiName, String ApiHost) {
        return apiJpaDao.findByApiNameAndApiHost(ApiName, ApiHost);
    }
}