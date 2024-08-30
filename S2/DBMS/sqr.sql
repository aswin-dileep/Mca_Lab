set serveroutput on

create or replace function sqr(num in number)
return number is 
sq number;

    begin 
        sq:=num*num;
        return sq;
end sqr;
/

declare
    i number;
    sqnum number; 
    n number:=&num;
begin

    for i in 1..n loop 
        sqnum:=sqr(i);
        insert into square values(i,sqnum);
        end loop;

end;
/

select * from square;