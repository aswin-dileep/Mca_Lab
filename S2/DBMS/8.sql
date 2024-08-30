set serveroutput on

create or replace procedure deposite(id in int,amount in int) is
begin
    update customer set balance=balance+amount where Ano=id;
    dbms_output.put_line('balance updated');
end;
/

declare
    ano int:=&ano;
    amt int:=&amt;

begin
    deposite(ano,amt);
end;
/
select * from customer;