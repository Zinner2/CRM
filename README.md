# CRM
CRM-客户管理系统
# 前端演示
## 登录
<img src="https://github.com/Zinner2/imgs/blob/master/crm-img/src/img/1.png" />

## 市场活动
<img src="https://github.com/Zinner2/imgs/blob/master/crm-img/src/img/2.png" />

## 线索(潜在客户)
<img src="https://github.com/Zinner2/imgs/blob/master/crm-img/src/img/3.png" />

## 客户
<img src="https://github.com/Zinner2/imgs/blob/master/crm-img/src/img/4.png" />

## 联系人
<img src="https://github.com/Zinner2/imgs/blob/master/crm-img/src/img/5.png" />

## 交易(商机)
<img src="https://github.com/Zinner2/imgs/blob/master/crm-img/src/img/6.png" />
<img src="https://github.com/Zinner2/imgs/blob/master/crm-img/src/img/7.png" />

# 技术选型
  1 - Mysql  
  2 - Spring  
  3 - SpringMVC  
  4 - Mybatis  
# 开发环境
  操作系统：Windows 10  
  IDE工具：IDEA  
  JDK：JDK1.8  
  中间件：Tomcat 9.0  
  构建工具：Maven  
  框架：SSM  
# 运行方式 
  <a href="">applicationContext.xml</a> 修改该配置文件即可: 
  
   <bean id="datasource" class="com.alibaba.druid.pool.DruidDataSource" init-method="init" destroy-method="close">
        <property name="url" value="jdbc:mysql://127.0.0.1:3306/你的数据库名字"></property>
        <property name="username" value="你的账号"></property>
        <property name="password" value="你的密码"></property>
    </bean>
  

