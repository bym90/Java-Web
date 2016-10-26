create table ConferenceRoomReserve
(
Room varchar2(20) not null,                 --ȸ�ǽ��̸�
LOC varchar2(20) not null,                  --ȸ�ǽ���ġ
NAME varchar2(10),                          --�������
ID number(15) constraint pk_ID primary key, --�����ȣ
CDEPT varchar2(20),                         --����μ�
RTime date constraint uni_RTime unique,     --����ð�
UTime date constraint uni_UTime unique,     --��������ð�
Capacity number(2) not null,                --����
--State char(1) constraint chk_Capacity check(Capacity in('O', 'X'))
--������� O X not null�� ���� ����ǳ�? ���� �̰� �ʿ��ϳ�?
);

select * from ConferenceRoomReserve;

drop table ConferenceRoomReserve;



--------------------------------------------------------------------------------
create table Notice
(
Category varchar2(20),                      --�� �з�
Title varchar2(100) not null,               --����
NAME varchar2(10) not null,                 --�ۼ���
ID number(15) constraint pk_ID primary key  --�����ȣ
);



--------------------------------------------------------------------------------
create table attendance
(
ID number(15) constraint pk_ID primary key, --�����ȣ
NAME varchar2(10) not null,
InTime date not null,      --��ٽð�
OutTime date not null,     --��ٽð�
EOutTime date,    --����ð�
OutSideTime date, --�ܱٽð�
PlusTime date --�߱ٽð��� ���� �ʿ��Ѱ� ��������� �ð��� ���� �����µ�...
);