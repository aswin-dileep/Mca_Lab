declare
	fact int :=1;
	x int :=&value;
	i int;
begin

	if fact >0 then
	for i in 1..x loop
		fact:=fact*i;
	end loop;
	dbms_output.put_line('factorial '||fact);
	else
	dbms_output.put_line('connot find ');
	end if;

end;
/
	