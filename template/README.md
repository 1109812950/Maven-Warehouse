#标准化Maven文件目录结构模版

`XX-client` 客户端模块，场景：Netty聊天室客户端、Android端、ios端等

`XX-common ` 公用模块

`XX-forward-route` 路由模块，场景：分布式架构

`XX-server` 服务端模块，场景：Netty聊天室服务器、Web网站服务器等

`XX-website` web模块

本模块项目提供通用的项目模块化设计的基础文件结构和相对完整的插件结构，以便项目团队能够快速搭建项目的基础结构和插件基础，
而不必后续大费周章去考虑还需要添加什么插件，还需要作出什么结构调整。标准的项目结构有利于以后团队可能从Maven转移到Gradle时
带来过多的不必要麻烦。

PS：从项目管理的发展角度来可以说是Maven升级到Gradle

##### 问题：

子模块名使用 XX-web，在子模块中添加引用可能出现依赖包导不进来的现象，没有出现任何报错信息，极其诡异！！ 


##### 其它使用注意事项：

i.关于子模块之间存在相互依赖务必小心搭建好模块之间的依赖架构图，理清楚依赖传递的规则和依赖的范围(scope)，
避免出现依赖冗余.

ii.dependency的scope的默认值为compile，请务必为每一个dependency进行认真的考虑，用好每一个scope来
优化POM，例如junit就应该将默认scope改为test，因为其只用在test package中，这样项目在打包发布至生产环
境的的时候就不会将junit一起进行打包这就是scope的作用。

##### 测试用例
测试用例在website模块的webApplication.java下，可以直接这个SpringBoot的Demo
启动测试用例后直接本地打开接口文档地址：http://localhost:8080/swagger-ui.html

website项目下的resource资源文件的conf下的dev、pro、test三个文件夹存放的是生成环境、开发环境、测试环境的文件及其标识，
是用来快速根据需求将项目部署到不同的环境下进行使用。

##### 一些插件常用的命令
versions一键版本升级：mvn versions:set -DnewVersion


至此，一个完整的模板已跑通，可以用来开发你的项目啦！！  