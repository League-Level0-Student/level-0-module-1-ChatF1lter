PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
 size(1000,1000);
 fill(#FFBC00);
 ellipse(500,500,900,900);
 fill(#FF0009);
 ellipse(500,500,850,850);
 fill(#FFEE29);
 ellipse(500,500,800,800);
 pepperoni = loadImage("pepperoni.png");
 mushroom = loadImage("mushroom.png");
 olive = loadImage("olive.png");
}
void draw() {
    if (mousePressed && (mouseButton == LEFT)) {
 image(pepperoni,mouseX,mouseY);
 }
 else if (mousePressed && (mouseButton == RIGHT)) {
 image(olive,mouseX,mouseY);
 }
 else if(mousePressed) {
 mushroom = loadImage("mushroom.png");
 }
}
