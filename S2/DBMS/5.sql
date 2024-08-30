set serveroutput on

create or replace function findmax(x in number,y in number)
    return number is z number;
    
    begin
        if x>y then
            z:=x;
        else
            z:=y;
        end if;
    
    return z;

end findmax;
/

declare
    a int:=23;
    b int:=11;
    c int;

begin

    c:=findmax(a,b);
    dbms_output.put_line('the largest number is '||c);

end;
/
