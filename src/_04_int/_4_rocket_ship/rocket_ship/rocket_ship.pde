int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 135, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 100, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 80, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 25, x + 50, y + 100, x - 50, y + 100);
    
    y-=10;
}
