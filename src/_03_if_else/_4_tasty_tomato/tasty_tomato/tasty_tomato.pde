void setup() {
    size(500, 500);
}
void draw() {  
    background(255, 255, 255);
    noStroke();
    fill(#FF3950);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#1AC618);
    rect(176, 103, 12, 32);
if(mousePressed){
  fill(#FFFFFF);
  ellipse(50,200, 100,100);
}
}
