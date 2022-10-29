PImage face;
void setup() {
size(500,500);
   face = loadImage("face.jpeg");
   face.resize(500,500);
   background(face);
}
void draw() {
  fill(255,mouseX,mouseY);
  ellipse(185,240,75,115);
  ellipse(100,275,75,100);
  fill(3,3,3);
  ellipse(100,275,20,35);
  ellipse(185,240,20,35);

}
