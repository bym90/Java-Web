create table ConferenceRoomReserve
(
Room varchar2(20) not null,                 --회의실이름
LOC varchar2(20) not null,                  --회의실위치
NAME varchar2(10),                          --빌린사람
ID number(15) constraint pk_ID primary key, --사원번호
CDEPT varchar2(20),                         --예약부서
RTime date constraint uni_RTime unique,     --예약시간
UTime date constraint uni_UTime unique,     --예약종료시간
Capacity number(2) not null,                --정원
--State char(1) constraint chk_Capacity check(Capacity in('O', 'X'))
--예약상태 O X not null이 같이 적용되나? 굳이 이게 필요하나?
);

select * from ConferenceRoomReserve;

drop table ConferenceRoomReserve;



--------------------------------------------------------------------------------
create table Notice
(
Category varchar2(20),                      --글 분류
Title varchar2(100) not null,               --제목
NAME varchar2(10) not null,                 --작성자
ID number(15) constraint pk_ID primary key  --사원번호
);



--------------------------------------------------------------------------------
create table attendance
(
ID number(15) constraint pk_ID primary key, --사원번호
NAME varchar2(10) not null,
InTime date not null,      --출근시간
OutTime date not null,     --퇴근시간
EOutTime date,    --조퇴시간
OutSideTime date, --외근시간
PlusTime date --야근시간이 굳이 필요한가 퇴근찍히는 시간을 보면 나오는데...
);
