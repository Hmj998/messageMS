create table MessageInfo
(
mid int identity(1,1)primary key ,
mcontent varchar(200)not null,
publish datetime not null
)
insert into MessageInfo values('金融危机','2021-1.14'),
('病毒危机','2021-1.14'),
('生命危机','2021-1.14')

select * from MessageInfo