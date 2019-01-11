int x1 = 250;
int x2 = 750;
void setup(){
   size(1000,500);
   noFill();
}

void draw()
{
   x1+=1;
   x2-=1;
   drawBullsEyes(x1,x2);
   if(x1==750)
   {
     x1=x2;
     x2=750;
   }
}

void drawBullsEyes(int leftX, int rightX)
{
   background(200,200,200);
   ellipse(leftX,250,400,400);
   ellipse(rightX,250,400,400);
   strokeWeight(2);
   for(int i = 400; i>0; i-=10)
   {
      ellipse(leftX,250,i,i);
      ellipse(rightX,250,i,i);
   }
   delay(25);
}
