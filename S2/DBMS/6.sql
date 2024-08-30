set serveroutput on;

create or replace procedure findMin(x in number,y in number,z out number) is

begin
    if x<y then 
    z:=y;
    else
        z:=x;
    end if;
end;
/
declare
a number;
b number;
c number;

begin

a:=&a;
b:=&b;
findMin(a,b,c);
dbms_output.put_line('Minimum value is :'||c);

end;
/

