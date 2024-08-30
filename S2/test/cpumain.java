//create a class cpu with attribute price.Create an inner class processor(no of cores,manufacturer) and 
//a static nested class RAM (memory,manufacturer).Create an object of cpu and price information of processor and ram

class cpu{
    float price;
    cpu(float p){
        price=p;
    }
    class processor{
        int noOfCores;
        String manufacturer;
        processor(int noc,String m){
            noOfCores=noc;
            manufacturer =m;
        }
        void pdisplay(){
            System.out.println("no of cores :"+noOfCores);
            System.out.println("Manufacturer :"+manufacturer);
            System.out.println("Price :"+price);
        }

    }

    static class ram{
        String memory,manufacturer;
        ram(String mem,String manu){
            memory=mem;
            manufacturer=manu;
        }
        void rdisplay(){
            System.out.println("Memory :"+memory);
            System.out.println("Manufacturer :"+manufacturer);
        }
    }
   
}

class cpumain{
    public static void main(String[] args){
        cpu c = new cpu(1500);
        cpu.processor p = c.new processor(3,"Intel");
        p.pdisplay();
        cpu.ram r =new cpu.ram("6gb","Samsung");
        r.rdisplay();

    }
}