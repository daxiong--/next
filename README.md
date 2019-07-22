# next

next 是一个适合中小企业快速组件化开发的模板项目。  
====
主要通过配置去控制组件化  
  >配置文件config  
    1.module.gradle  
      1.壳模块加载具体的模块配置，自由加载想要的模块  
      2.自动分发业务模块的对外开放数据  
    2.publish.gradle  
      1.版本code,name,appid控制  
      2.提交一件上传到蒲公英  
      3.配置网络请求环境  
    3.version.gradle  
      统一管理所有库的版本，仓库，提供模块的基础加载库  
      
      
  >组件可以实现自己的application级别初始化，使用autoRegister在编译期自动注入
  
