set serveroutput on

declare
    str varchar(10):='&string';
    rev varchar(10):=' ';
    i int;
    len int;
begin

    len:=length(str);
    for i in reverse 1..len loop
        rev:=rev||substr(str,i,1);
    end loop;

    dbms_output.put_line('the reversed string :'||rev);

end;
/
