set serveroutput on

declare
    num int:=&number;

begin
    if (mod(num,2)=0) then
        dbms_output.put_line(num ||' is even');
    else
        dbms_output.put_line(num ||' is odd');
    end if;

end;
/