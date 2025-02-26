class datatype
{
    //There are 2 types of datatypes:
    //1.Primitive 2.Non-Primitive
    //Primitve: Integars,Float,Character,Boolean
    //Integers=>byte(1 byte),short(2 bytes),int(4 bytes),long(8bytes)
    //float=>double(8 bytes *default*),float(4 bytes)
    //character=>char(2 bytes)
    //boolean=>true or false
   public static void main(String[] args) 
   {
     double num1=5.8999999;
     float num2=7.88f; //explicitly mention that it is float
     long lnum=78999999999l; //explicitly mention that it is long
     boolean flag=true;
     double result=num1+num2;
     System.out.println(result);
   }
}