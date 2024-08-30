set serveroutput on

create or replace procedure sq(x in out number) is 
begin
    x:=x*x;
end;
/

declare
a number:=&num;
begin
    sq(a);
    dbms_output.put_line('square is '||a);
end;
/