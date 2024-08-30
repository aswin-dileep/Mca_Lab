set serveroutput on;

create or replace trigger t1
after insert or update on xy
for each row
begin
    if inserting then
        insert into testtable values('insert done', SYSDATE);
    elsif updating then
        insert into testtable values('update done', SYSDATE);
    end if;
end;
/
