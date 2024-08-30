declare
 x int:=&value;
 fact float :=1;
 i int;

begin
	if x >0 then
		for i in 1..x loop
			fact := fact*i;
		end loop;
		dbms_output.put_line('factorial is '||fact);
	else
		dbms_output.put_line('factorial not founed');
 	end if;

end;
/
	