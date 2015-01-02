drop table if exists TB_SHOP_DEMO;

/*==============================================================*/
/* Table: DEMO                                   */
/*==============================================================*/
create table TB_SHOP_DEMO
(
   DEMO_ID            int(11) not null auto_increment comment 'DEMOID',
   NAME                 char(64) not null comment '名称',
   CREATE_TIME          timestamp not null comment '创建时间',
   CREATE_PERSON        int(11) comment '创建人',
   UPDATE_TIME          timestamp not null comment '更新时间',
   UPDATE_PERSON        int(11) comment '更新人',
   primary key (DEMO_ID)
);

alter table TB_SHOP_DEMO comment '演示';