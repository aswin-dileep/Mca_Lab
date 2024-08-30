set serveroutput on

create or replace function addnum(x in number, y in number )
return number is r number;

    begin
        r:=x+y;
        return r;

end addnum;
/

