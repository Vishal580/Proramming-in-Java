class BoxVolume
{
  double width;
  double hight;
  double depth;
  BoxVolume(double w,double h,double d)
  {
     width=w;
     hight=h;
     depth=d;
  }
  double volume()
  {
     return width*hight*depth;
  }
}
class BoxDemo
{
   public static void main(String[] args)
   {
      BoxVolume mybox1=new BoxVolume(10,20,15);
      BoxVolume mybox2=new BoxVolume(3,6,9);
      double vol1=mybox1.volume();
      System.out.println("Box1 volume="+vol1);
      double vol2=mybox2.volume(); 
      System.out.println("Box2 volume="+vol2);
   }
}