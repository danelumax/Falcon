package com.daniel.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //加入这个注解，Demo就会进行持久化了
@Table(name="auto_create_table")
public class ApiName {

    @Id
    @GeneratedValue //主键，自动递 增
    private Integer id;
    @Column(name = "apiName")
    private String apiName; //接口名称
    @Column(name = "apiHost")
    private String apiHost; //接口地址
    @Column(name = "requestUrl")
    private String requestUrl; //接口请求地址
    @Column(name = "requestMethod")
    private String requestMethod; //接口请求方法

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiHost() {
        return apiHost;
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }
}