--创建数据库
create database if not exists paipai default charset utf8 collate utf8_general_ci;

--创建用户
CREATE USER paipai IDENTIFIED  BY 'paipai' ;
 
--授权
grant all privileges on paipai.* to paipai@"%" identified  by 'paipai';
grant all privileges on paipai.* to paipai@"127.0.0.1" identified  by 'paipai';
grant all privileges on paipai.* to paipai@"localhost" identified  by 'paipai';
flush privileges;

