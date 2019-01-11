void setup(){
   size(500,500);
   color(255,255,255);
   ellipse(250,250,400,400);
  noFill();
  for(int i = 400; i>0; i-=20)
  {
    if((i%40)==0)
    {
      fill(255,255,255);
    }
    else
    {
      fill(255,0,0);
    }
    ellipse(250,250,i,i);
  }
  
  
  
}
