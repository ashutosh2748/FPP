package lesson5;

public class Main {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee[] test=new Employee[5];
SalariedEmployee test2=new SalariedEmployee("Sunanda","Ghimire","77777777",4000);
test[0]=new CommissionEmployee("Ashutosh","Ghimire","12345678",0.0,1);
test[1]=new BasePlusCommissionEmployee("Arbin","Ghimire","11111111",0.0,0.0,5000.0);
test[2]=new SalariedEmployee("Renuka","Khatiwada","22222222",7000);
test[3]=new HourlyEmployee("Aalok","Ghimire","44444444",0,35);
test[4]=test2;
Invoice bill1=new Invoice("TC12345","Green Coloured Toyotota Camry Car",1,15000.0);

test2.setSalary(6000);
test2.jpt=5;

if(test[1] instanceof BasePlusCommissionEmployee){
	BasePlusCommissionEmployee abcd=(BasePlusCommissionEmployee)test[1];
	abcd.setCommissionRate(2);
}

test[0].modifyEmployee();




for(Employee cc : test)
{
	System.out.println(cc.getFirstName()+" "+cc.getLastName()+" [ "+cc.getClass().getSimpleName()+"] Payable Amount is:"+cc.getPaymentAmount());
	}
System.out.println("Total billed Amount for car:"+bill1.getClass().getSimpleName()+bill1.getPaymentAmount()+"\n\n\n");

	
	
	for(Employee c: test)
	{
		System.out.println(c.toString());
	}
	System.out.println(test.toString());
	}
	
}
